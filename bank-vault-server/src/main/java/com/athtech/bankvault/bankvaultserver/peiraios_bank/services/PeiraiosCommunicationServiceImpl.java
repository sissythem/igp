package com.athtech.bankvault.bankvaultserver.peiraios_bank.services;

import com.athtech.bankvault.bankvaultserver.commons.errors.exceptions.BankVaultExcpetion;
import com.athtech.bankvault.bankvaultserver.commons.payloads.TokenResponsePayload;
import com.athtech.bankvault.bankvaultserver.commons.services.RestService;
import com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.PeiraiosTokenResponsePayload;
import com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.accounts.AccountDetailsResponsePayload;
import com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.accounts.AccountsPayload;
import com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.accounts.IbanInfoPayload;
import com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.cards.CardsResponsePayload;
import com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.transactions.AccountTransactions;
import com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.transactions.TransactionsInput;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Service
public class PeiraiosCommunicationServiceImpl implements PeiraiosCommunicationService {

    private static final Logger LOGGER = Logger.getLogger( PeiraiosCommunicationServiceImpl.class.getName() );

    private final RestService restService;

    @Value("${peiraios.api.base-url}")
    private String peraiosBaseUrl;

    @Value("${peiraios.api.account}")
    private String peiraiosAccountUrl;

    @Value("${peiraios.api.cards}")
    private String peiraiosCardUrl;

    @Value("${peiraios.api.account-details-url}")
    private String peiraiosAccountDetailsUrl;

    @Value("${peiraios.api.iban-url}")
    private String peiraiosIbanUrl;

    @Value("${peiraios.api.oauth}")
    private String peiraiosOauthUrl;

    @Value("${peiraios.application.client-id}")
    private String clientId;


    @Value("${peiraios.application.client-secret}")
    private String clientSecret;

    @Autowired
    public PeiraiosCommunicationServiceImpl(RestService restService) {
        this.restService = restService;
    }

    @Override
    public TokenResponsePayload retrieveToken(String code) {

        ResponseEntity<PeiraiosTokenResponsePayload> response;
        RestTemplate restTemplate = new RestTemplate();

        String url = peraiosBaseUrl.concat(peiraiosOauthUrl);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        headers.setAccept(Collections.singletonList(APPLICATION_JSON));

        MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
        map.add("grant_type", "authorization_code");
        map.add("code", code);
        map.add("client_id", clientId);
        map.add("client_secret", clientSecret);
        map.add("redirect_uri", "http://localhost:4200/auth");

        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(map, headers);

        response = restTemplate.postForEntity(url, request, PeiraiosTokenResponsePayload.class);

        LOGGER.log( Level.INFO, "Got Peiraios Token", response.getBody().getAccessToken() );

        return new TokenResponsePayload(response.getBody().getAccessToken());
    }

    @Override
    public AccountsPayload retrieveAccounts(String token) throws BankVaultExcpetion {

        String url = peraiosBaseUrl.concat(peiraiosAccountUrl);

        try{
            String response = restService.get(url, createHeaders(token)).getResponseBody().get();

            LOGGER.log( Level.INFO, String.format("Got Peiraios Accounts from %s", url));

            return convertToResponse(response, AccountsPayload.class);

        }catch (Exception e){
            LOGGER.log( Level.WARNING, "Failed to retrieve Peiraios Accouts");
            throw new BankVaultExcpetion(e.getMessage());
        }

    }

    @Override
    public IbanInfoPayload retrieveIbanInfo(String token, String iban) throws BankVaultExcpetion{

        String url = peraiosBaseUrl.concat(peiraiosAccountUrl).concat(iban).concat(peiraiosIbanUrl);

        try{
            String response = restService.get(url, createHeaders(token)).getResponseBody().get();
            LOGGER.log( Level.INFO, String.format("Got Iban from %s", url));
            return convertToResponse(response, IbanInfoPayload.class);

        }catch (Exception e){
            LOGGER.log( Level.WARNING, "Failed to retrieve Peiraios Iban");
            throw new BankVaultExcpetion(e.getMessage());
        }

    }

    @Override
    public AccountDetailsResponsePayload retrieveAccountDetails(String token, String accountId) throws BankVaultExcpetion {

        String url = peraiosBaseUrl.concat(peiraiosAccountUrl).concat(accountId).concat(peiraiosAccountDetailsUrl);


        try{
            String response = restService.get(url, createHeaders(token)).getResponseBody().get();
            LOGGER.log( Level.INFO, String.format("Got Peiraios Account details info from %s", url));
            return convertToResponse(response, AccountDetailsResponsePayload.class);

        }catch (Exception e){
            LOGGER.log( Level.WARNING, "Failed to retrieve Peiraios Accout Details for account: {0}", accountId);
            throw new BankVaultExcpetion(e.getMessage());
        }

    }

    @Override
    public CardsResponsePayload retrieveCardInfo(String token) throws BankVaultExcpetion {

        String url = peraiosBaseUrl.concat(peiraiosCardUrl);

        try{
            String response = restService.get(url, createHeaders(token)).getResponseBody().get();
            return convertToResponse(response, CardsResponsePayload.class);

        }catch (Exception e){
            LOGGER.log( Level.WARNING, "Failed to retrieve Peiraios Cards");
            throw new BankVaultExcpetion(e.getMessage());
        }
    }

    @Override
    public ResponseEntity<AccountTransactions> getAccountTransactions(String accountId, String token)
            throws JsonProcessingException {

        TransactionsInput transactionsInput = createStandardTransactionsFilter();

        ObjectMapper mapper = new ObjectMapper();

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<AccountTransactions> response = null;

        try {
            // convert user object to json string and return it

            String input_filter = mapper.writeValueAsString(transactionsInput);
            String url = peraiosBaseUrl.concat(peiraiosAccountUrl).concat(accountId) + "/transactions" + "/"
                    + "{input_filter}";

            HttpEntity httpEntity = new HttpEntity<>(createHeaders(token));
            response = restTemplate.exchange(url, HttpMethod.GET, httpEntity, AccountTransactions.class, input_filter);

            LOGGER.log( Level.INFO, String.format("Got Peiraios Account transactions info from %s", url));

            response.getBody();

        }
        // catch various errors
        catch (JsonGenerationException | JsonMappingException e) {
            LOGGER.log( Level.WARNING, "Failed to retrieve Peiraios Account Transactions with error: {0}", e.getMessage());
            throw new BankVaultExcpetion(e.getMessage());
        }
        return response;
    }

    //Helper Methods

    private HttpHeaders createHeaders(String token) {

        HttpHeaders headers = new HttpHeaders();

        headers.add("accept", String.valueOf(APPLICATION_JSON));
        headers.add("x-ibm-client-id", clientId);
        headers.add("authorization", "Bearer ".concat(token));

        return headers;
    }

    private TransactionsInput createStandardTransactionsFilter(){

        TransactionsInput transactionsInput = new TransactionsInput();
        transactionsInput.setFromDate("2015-1-9");
        transactionsInput.setToDate("2019-4-9");
        transactionsInput.setFromRow("");
        transactionsInput.setLastBalance(10);
        transactionsInput.setPageSize(20);

        return transactionsInput;
    }


    private <T> T convertToResponse(String response, Class<T> returnClass) {

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            LOGGER.log(Level.INFO, String.format("Mapping now to %s from response: %s", returnClass.getName(), response));
            return objectMapper.readValue(response, returnClass);
        } catch (IOException e) {
            throw new BankVaultExcpetion("Error while parsing response from bank for class" + returnClass.getSimpleName());
        }
    }
}

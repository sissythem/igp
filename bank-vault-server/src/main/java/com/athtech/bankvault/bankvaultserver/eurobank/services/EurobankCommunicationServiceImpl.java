package com.athtech.bankvault.bankvaultserver.eurobank.services;

import com.athtech.bankvault.bankvaultserver.commons.errors.exceptions.BankVaultExcpetion;
import com.athtech.bankvault.bankvaultserver.commons.payloads.TokenResponsePayload;
import com.athtech.bankvault.bankvaultserver.commons.services.RestService;
import com.athtech.bankvault.bankvaultserver.eurobank.payloads.accounts.AccountsResponsePayload;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import java.io.IOException;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Service
public class EurobankCommunicationServiceImpl implements EurobankCommunicationService {


    private final RestService restService;


    @Value("${eurobank.application.request-id}")
    private String requestId;

    @Value("${eurobank.application.ibm-id}")
    private String ibmId;

    @Value("${eurobank.api.base-url}")
    private String eurobankUrl;

    @Value("${eurobank.api.accounts-url}")
    private String accountUrl;

    @Autowired
    public EurobankCommunicationServiceImpl(RestService restService) {
        this.restService = restService;
    }

    @Override
    public TokenResponsePayload retrieveTokenFromEurobank(String code) {
        return null;
    }

    @Override
    public AccountsResponsePayload retrieveAccountsFromEurobank(TokenResponsePayload tokenResponsePayload) {

        String url = eurobankUrl.concat(accountUrl);

        String consentId = tokenResponsePayload.getToken();

        String response = restService.get(url, createHeaders(consentId)).getResponseBody().get();

        return convertToResponse(response, AccountsResponsePayload.class);
    }


    //HELPER METHODS

    private HttpHeaders createHeaders(String consentId){

        HttpHeaders headers = new HttpHeaders();

        headers.add("accept", String.valueOf(APPLICATION_JSON));
        headers.add("X-Request-ID", requestId);
        headers.add("X-IBM-Client-Id",  ibmId);
        headers.add("consent-id",  consentId);


        return headers;
    }

    private <T> T convertToResponse(String response, Class<T> returnClass){

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            return objectMapper.readValue(response, returnClass);
        } catch (IOException e) {
            throw  new BankVaultExcpetion("Error while parsing response from bank for class" + returnClass.getSimpleName());
        }
    }

}

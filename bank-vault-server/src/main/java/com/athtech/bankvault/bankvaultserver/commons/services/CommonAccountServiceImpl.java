package com.athtech.bankvault.bankvaultserver.commons.services;

import com.athtech.bankvault.bankvaultserver.commons.errors.exceptions.BankVaultExcpetion;
import com.athtech.bankvault.bankvaultserver.commons.payloads.BankVaultAccountDetailsPayload;
import com.athtech.bankvault.bankvaultserver.commons.payloads.BankVaultAccountDetailsResponsePayload;
import com.athtech.bankvault.bankvaultserver.commons.payloads.BankVaultAccountPayload;
import com.athtech.bankvault.bankvaultserver.commons.payloads.TokenResponsePayload;
import com.athtech.bankvault.bankvaultserver.eurobank.services.EurobankCommunicationService;
import com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.accounts.AccountDetailsPayload;
import com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.accounts.AccountDetailsResponsePayload;
import com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.accounts.AccountsPayload;
import com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.cards.CardsResponsePayload;
import com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.transactions.AccountTransaction;
import com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.transactions.AccountTransactions;
import com.athtech.bankvault.bankvaultserver.peiraios_bank.services.PeiraiosCommunicationService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Service
public class CommonAccountServiceImpl implements CommonAccountService {

    private final PeiraiosCommunicationService peiraiosCommunicationService;
    private final EurobankCommunicationService eurobankCommunicationService;
    private final PeiraiosAccountToBankVaultAccountMapperService peiraiosAccountToBankVaultAccountMapperService;
    private final EurobankAccountToBankVaultAccountMapperService eurobankAccountToBankVaultAccountMapperService;

    @Autowired
    public CommonAccountServiceImpl(PeiraiosCommunicationService peiraiosCommunicationService,
                                    EurobankCommunicationService eurobankCommunicationService,
                                    PeiraiosAccountToBankVaultAccountMapperService peiraiosAccountToBankVaultAccountMapperService,
                                    EurobankAccountToBankVaultAccountMapperService eurobankAccountToBankVaultAccountMapperService) {
        this.peiraiosCommunicationService = peiraiosCommunicationService;
        this.eurobankCommunicationService = eurobankCommunicationService;
        this.peiraiosAccountToBankVaultAccountMapperService = peiraiosAccountToBankVaultAccountMapperService;
        this.eurobankAccountToBankVaultAccountMapperService = eurobankAccountToBankVaultAccountMapperService;
    }


    @Override
    public List<BankVaultAccountPayload> retrieveAllAccounts(TokenResponsePayload tokenResponsePayload) throws BankVaultExcpetion {

        List<BankVaultAccountPayload> bankVaultAccounts = new ArrayList<>();

        AccountsPayload peiraiosAccounts = peiraiosCommunicationService.retrieveAccounts(tokenResponsePayload.getToken());
        //TODO need fix eurobank (they change theirs docs)
        //
//        AccountsResponsePayload eurobankAccounts = eurobankCommunicationService.retrieveAccountsFromEurobank(tokenResponsePayload);


        if (peiraiosAccounts != null) {
            bankVaultAccounts.addAll(peiraiosAccountToBankVaultAccountMapperService.transformAccount(peiraiosAccounts));
/*            for (AccountPayload account: peiraiosAccounts.getAccounts()) {
                accountId = account.getAccountId();
            }*/
        }


//        if (eurobankAccounts != null) {
//            bankVaultAccounts.addAll(eurobankAccountToBankVaultAccountMapperService.transformAccount(eurobankAccounts));
//        }


        return  bankVaultAccounts;
    }

    @Override
    public CardsResponsePayload retrieveAllCards(TokenResponsePayload tokenResponsePayload) {

        return peiraiosCommunicationService.retrieveCardInfo(tokenResponsePayload.getToken());
    }

    @Override
    public BankVaultAccountDetailsResponsePayload retrieveAccountDetails(TokenResponsePayload tokenResponsePayload, String accountId) throws JsonProcessingException {

        BankVaultAccountDetailsResponsePayload responsePayload = new BankVaultAccountDetailsResponsePayload();

        mapAccountDetails(responsePayload, accountId, tokenResponsePayload.getToken());
        mapAccountTransactions(responsePayload, accountId, tokenResponsePayload.getToken());

        return responsePayload;
    }

    private void mapAccountDetails(BankVaultAccountDetailsResponsePayload responsePayload, String accountId, String token){

        AccountDetailsResponsePayload accountDetailsResponsePayload= peiraiosCommunicationService.retrieveAccountDetails(token, accountId);
        if(null != accountDetailsResponsePayload){
            responsePayload.setAccountDetailsPayload(peiraiosAccountToBankVaultAccountMapperService.transformAccountDetails(accountDetailsResponsePayload.getAccountDetails()));
        }
    }

    private void mapAccountTransactions(BankVaultAccountDetailsResponsePayload responsePayload, String accountId, String token) throws JsonProcessingException {

        AccountTransactions transactions = peiraiosCommunicationService.getAccountTransactions(accountId, token).getBody();

        if(null != transactions){
            for (AccountTransaction accountTransaction: transactions.getAccountTransactions()){
                responsePayload.getAccountDetailsTransactionsPayload().add(peiraiosAccountToBankVaultAccountMapperService.transformTransactions(accountTransaction));
            }
        }
        else {
            responsePayload.setAccountDetailsTransactionsPayload(Collections.EMPTY_LIST);
        }
    }
}

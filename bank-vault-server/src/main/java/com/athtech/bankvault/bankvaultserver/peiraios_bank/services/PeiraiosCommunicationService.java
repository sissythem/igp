package com.athtech.bankvault.bankvaultserver.peiraios_bank.services;

import com.athtech.bankvault.bankvaultserver.commons.errors.exceptions.BankVaultExcpetion;
import com.athtech.bankvault.bankvaultserver.commons.payloads.TokenResponsePayload;
import com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.accounts.AccountDetailsResponsePayload;
import com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.accounts.AccountsPayload;
import com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.accounts.IbanInfoPayload;
import com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.cards.CardsResponsePayload;
import com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.transactions.AccountTransactions;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.ResponseEntity;

public interface PeiraiosCommunicationService {

    TokenResponsePayload retrieveToken(String code);

    AccountsPayload retrieveAccounts(String token) throws BankVaultExcpetion;

    IbanInfoPayload retrieveIbanInfo(String token, String iban) throws BankVaultExcpetion;

    AccountDetailsResponsePayload retrieveAccountDetails(String token, String accountId) throws BankVaultExcpetion;

    ResponseEntity<AccountTransactions> getAccountTransactions(String accountId, String token)
            throws JsonProcessingException;

    CardsResponsePayload retrieveCardInfo(String token) throws BankVaultExcpetion;

}

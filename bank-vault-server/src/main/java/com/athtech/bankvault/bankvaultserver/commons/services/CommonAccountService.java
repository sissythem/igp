package com.athtech.bankvault.bankvaultserver.commons.services;

import com.athtech.bankvault.bankvaultserver.commons.errors.exceptions.BankVaultExcpetion;
import com.athtech.bankvault.bankvaultserver.commons.payloads.BankVaultAccountDetailsResponsePayload;
import com.athtech.bankvault.bankvaultserver.commons.payloads.BankVaultAccountPayload;
import com.athtech.bankvault.bankvaultserver.commons.payloads.TokenResponsePayload;
import com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.cards.CardsResponsePayload;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;
import java.util.List;

public interface CommonAccountService {

    List<BankVaultAccountPayload> retrieveAllAccounts(TokenResponsePayload tokenResponsePayload) throws BankVaultExcpetion;

    CardsResponsePayload retrieveAllCards(TokenResponsePayload tokenResponsePayload);

    BankVaultAccountDetailsResponsePayload retrieveAccountDetails(TokenResponsePayload tokenResponsePayload, String accountId) throws JsonProcessingException;
}

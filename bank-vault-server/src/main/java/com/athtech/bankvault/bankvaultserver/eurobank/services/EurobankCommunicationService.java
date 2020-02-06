package com.athtech.bankvault.bankvaultserver.eurobank.services;

import com.athtech.bankvault.bankvaultserver.commons.payloads.TokenResponsePayload;
import com.athtech.bankvault.bankvaultserver.eurobank.payloads.accounts.AccountsResponsePayload;

public interface EurobankCommunicationService {

    TokenResponsePayload retrieveTokenFromEurobank(String code);

    AccountsResponsePayload retrieveAccountsFromEurobank(TokenResponsePayload tokenResponsePayload);
}

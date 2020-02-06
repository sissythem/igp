package com.athtech.bankvault.bankvaultserver.commons.services;

import com.athtech.bankvault.bankvaultserver.commons.payloads.BankVaultAccountPayload;
import com.athtech.bankvault.bankvaultserver.eurobank.payloads.accounts.AccountsResponsePayload;

import java.util.List;

public interface EurobankAccountToBankVaultAccountMapperService {

    List<BankVaultAccountPayload> transform(AccountsResponsePayload accountsPayload);
}

package com.athtech.bankvault.bankvaultserver.commons.services;

import com.athtech.bankvault.bankvaultserver.commons.payloads.BankVaultAccountDetailsPayload;
import com.athtech.bankvault.bankvaultserver.commons.payloads.BankVaultAccountDetailsTransactionsPayload;
import com.athtech.bankvault.bankvaultserver.commons.payloads.BankVaultAccountPayload;
import com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.accounts.AccountDetailsPayload;
import com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.accounts.AccountsPayload;
import com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.transactions.AccountTransaction;

import java.util.List;

public interface PeiraiosAccountToBankVaultAccountMapperService {

    List<BankVaultAccountPayload> transformAccount(AccountsPayload accountsPayload);

    BankVaultAccountDetailsTransactionsPayload transformTransactions(AccountTransaction accountTransaction);

    BankVaultAccountDetailsPayload transformAccountDetails(AccountDetailsPayload accountDetailsPayload);
}

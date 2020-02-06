package com.athtech.bankvault.bankvaultserver.commons.services;


import com.athtech.bankvault.bankvaultserver.commons.payloads.Bank;
import com.athtech.bankvault.bankvaultserver.commons.payloads.BankVaultAccountDetailsPayload;
import com.athtech.bankvault.bankvaultserver.commons.payloads.BankVaultAccountDetailsTransactionsPayload;
import com.athtech.bankvault.bankvaultserver.commons.payloads.BankVaultAccountPayload;
import com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.accounts.AccountDetailsPayload;
import com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.accounts.AccountPayload;
import com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.accounts.AccountsPayload;
import com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.transactions.AccountTransaction;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class PeiraiosAccountToBankVaultAccountMapperServiceImpl implements PeiraiosAccountToBankVaultAccountMapperService{


    @Override
    public List<BankVaultAccountPayload> transformAccount(AccountsPayload accountsPayload) {

        List<BankVaultAccountPayload> peraiosAccounts = new ArrayList<>();

        for(AccountPayload accountPayload: accountsPayload.getAccounts()) {

            BankVaultAccountPayload account = new BankVaultAccountPayload();
            account.setBank(Bank.PEIRAIOS.name());
            account.setIban(accountPayload.getIban());
            account.setCurrency(accountPayload.getCurrency());
            account.setBalance(accountPayload.getBalance());
            account.setAccountId(accountPayload.getAccountId());
            account.setAssetAlias(accountPayload.getAlias());

            peraiosAccounts.add(account);
        }


        return peraiosAccounts;
    }

    @Override
    public BankVaultAccountDetailsTransactionsPayload transformTransactions(AccountTransaction accountTransaction) {

        BankVaultAccountDetailsTransactionsPayload accountDetailsTransactionsPayload = new BankVaultAccountDetailsTransactionsPayload();

        accountDetailsTransactionsPayload.setAmount(BigDecimal.valueOf(accountTransaction.getAmount()));
        accountDetailsTransactionsPayload.setDescription(accountTransaction.getDescription());
        accountDetailsTransactionsPayload.setPostDate(accountTransaction.getPostDate());
        accountDetailsTransactionsPayload.setValueDate(accountTransaction.getValueDate());
        accountDetailsTransactionsPayload.setTransactionId(accountTransaction.getTransactionId());
        accountDetailsTransactionsPayload.setTransactionReference(accountTransaction.getTransactionReference());

        return accountDetailsTransactionsPayload;

    }

    @Override
    public BankVaultAccountDetailsPayload transformAccountDetails(AccountDetailsPayload accountDetailsPayload) {

        BankVaultAccountDetailsPayload detailsPayload = new BankVaultAccountDetailsPayload ();

        detailsPayload.setAccountingBalance(BigDecimal.valueOf(accountDetailsPayload.getAccountingBalance()));
        detailsPayload.setBalance(BigDecimal.valueOf(accountDetailsPayload.getBalance()));
        detailsPayload.setDebit(accountDetailsPayload.isCanDebit());
        detailsPayload.setDescription(accountDetailsPayload.getAccountTypeDescription());
        detailsPayload.setStatus(accountDetailsPayload.getStatus());

        return detailsPayload;

    }
}

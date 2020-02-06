package com.athtech.bankvault.bankvaultserver.commons.services;

import com.athtech.bankvault.bankvaultserver.commons.payloads.Bank;
import com.athtech.bankvault.bankvaultserver.commons.payloads.BankVaultAccountPayload;
import com.athtech.bankvault.bankvaultserver.eurobank.payloads.accounts.AccountBalanceAmountPayload;
import com.athtech.bankvault.bankvaultserver.eurobank.payloads.accounts.AccountBalancePayload;
import com.athtech.bankvault.bankvaultserver.eurobank.payloads.accounts.AccountPayload;
import com.athtech.bankvault.bankvaultserver.eurobank.payloads.accounts.AccountsResponsePayload;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EurobankAccountToBankVaultAccountMapperServiceImpl implements  EurobankAccountToBankVaultAccountMapperService {

    @Override
    public List<BankVaultAccountPayload> transform(AccountsResponsePayload accountsPayload) {

        List<BankVaultAccountPayload> eurobankAccounts = new ArrayList<>();

        for(AccountPayload accountPayload: accountsPayload.getAccounts()) {

            BankVaultAccountPayload account = new BankVaultAccountPayload();
            account.setBank(Bank.EUROBANK.name());
            account.setIban(accountPayload.getIban());
            account.setCurrency(accountPayload.getCurrency());
            account.setBalance(calculateBalance(accountPayload.getBalances()));
            account.setAccountId(accountPayload.getResourceId());

            eurobankAccounts.add(account);
        }


        return eurobankAccounts;
    }

    private BigDecimal calculateBalance(List<AccountBalancePayload> balances){

        ArrayList<BigDecimal> balanceAmounts = new ArrayList<>();

        for (AccountBalancePayload accountBalanceAmountPayload: balances) {

            balanceAmounts.add(new BigDecimal(accountBalanceAmountPayload.getBalanceAmount().getAmount()));
        }

        return balanceAmounts.stream()
                .reduce(BigDecimal::add)
                .get();
    }
}

package com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.transactions;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class AccountTransactions {

    @JsonProperty(value = "AccountTransactions")
    private List<AccountTransaction> accountTransactions;

    @JsonProperty(value = "PagingInfo")
    private PagingInfo pagingInfo;

    public AccountTransactions(List<AccountTransaction> accountTransactions, PagingInfo pagingInfo) {
        this.accountTransactions = accountTransactions;
        this.pagingInfo = pagingInfo;
    }

    public AccountTransactions() {
    }

    public List<AccountTransaction> getAccountTransactions() {
        return accountTransactions;
    }

    public void setAccountTransactions(List<AccountTransaction> accountTransactions) {
        this.accountTransactions = accountTransactions;
    }

    public PagingInfo getPagingInfo() {
        return pagingInfo;
    }

    public void setPagingInfo(PagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
    }
}



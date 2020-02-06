package com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.accounts;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class AccountsPayload {

    //Wrapper class for the accounts list from Peiraios Bank API

    @JsonProperty(value = "Accounts")
    private List<AccountPayload> accounts;

    public List<AccountPayload> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<AccountPayload> accounts) {
        this.accounts = accounts;
    }

    public AccountsPayload(List<AccountPayload> accounts) {
        this.accounts = accounts;
    }

    public AccountsPayload() {
    }

    @Override
    public String toString() {
        return "AccountsPayload{" +
                "accounts=" + accounts +
                '}';
    }
}

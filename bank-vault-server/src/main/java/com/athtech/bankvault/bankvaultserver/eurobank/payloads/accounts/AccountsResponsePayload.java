package com.athtech.bankvault.bankvaultserver.eurobank.payloads.accounts;

import java.util.List;

public class AccountsResponsePayload {

    private List<AccountPayload> accounts;

    public AccountsResponsePayload() {
    }

    public AccountsResponsePayload(List<AccountPayload> accounts) {
        this.accounts = accounts;
    }

    public List<AccountPayload> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<AccountPayload> accounts) {
        this.accounts = accounts;
    }
}

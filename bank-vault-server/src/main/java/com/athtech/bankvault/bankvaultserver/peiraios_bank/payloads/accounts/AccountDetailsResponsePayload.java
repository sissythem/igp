package com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.accounts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountDetailsResponsePayload {

    @JsonProperty("AccountDetails")
    private AccountDetailsPayload accountDetails;

    public AccountDetailsResponsePayload(){

    }

    public AccountDetailsResponsePayload(AccountDetailsPayload accountDetails) {
        this.accountDetails = accountDetails;
    }

    public AccountDetailsPayload getAccountDetails() {
        return accountDetails;
    }

    public void setAccountDetails(AccountDetailsPayload accountDetails) {
        this.accountDetails = accountDetails;
    }
}

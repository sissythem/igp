package com.athtech.bankvault.bankvaultserver.eurobank.payloads.accounts;

public class AccountBalanceAmountPayload {

    private String currency;

    private String amount;

    public AccountBalanceAmountPayload() {
    }

    public AccountBalanceAmountPayload(String currency, String amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}

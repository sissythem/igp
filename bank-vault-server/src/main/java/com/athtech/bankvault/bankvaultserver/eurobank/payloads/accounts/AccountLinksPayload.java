package com.athtech.bankvault.bankvaultserver.eurobank.payloads.accounts;

public class AccountLinksPayload {

    private String balances;

    private String transactions;

    public AccountLinksPayload() {
    }

    public AccountLinksPayload(String balances, String transactions) {
        this.balances = balances;
        this.transactions = transactions;
    }

    public String getBalances() {
        return balances;
    }

    public void setBalances(String balances) {
        this.balances = balances;
    }

    public String getTransactions() {
        return transactions;
    }

    public void setTransactions(String transactions) {
        this.transactions = transactions;
    }
}

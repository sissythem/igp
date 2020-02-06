package com.athtech.bankvault.bankvaultserver.commons.payloads;

import java.math.BigDecimal;

public class BankVaultAccountPayload {

    private String bank;

    private BigDecimal balance;

    private String iban;

    private String currency;

    private String accountId;

    private String assetAlias;

    public BankVaultAccountPayload() {
    }

    public String getAssetAlias() {
        return assetAlias;
    }

    public void setAssetAlias(String assetAlias) {
        this.assetAlias = assetAlias;
    }

    public BankVaultAccountPayload(String bank, BigDecimal balance, String iban, String currency, String accountId
    , String assetAlias) {
        this.bank = bank;
        this.balance = balance;
        this.iban = iban;
        this.currency = currency;
        this.accountId = accountId;
        this.assetAlias = assetAlias;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
}

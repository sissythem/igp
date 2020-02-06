package com.athtech.bankvault.bankvaultserver.commons.payloads;

import java.math.BigDecimal;

public class BankVaultAccountDetailsPayload {

    private BigDecimal balance;

    private BigDecimal accountingBalance;

    private String description;

    private String status;

    private boolean isDebit;

    public BankVaultAccountDetailsPayload(){}

    public BankVaultAccountDetailsPayload(BigDecimal balance, BigDecimal accountingBalance, String description, String status, boolean isDebit) {
        this.balance = balance;
        this.accountingBalance = accountingBalance;
        this.description = description;
        this.status = status;
        this.isDebit = isDebit;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getAccountingBalance() {
        return accountingBalance;
    }

    public void setAccountingBalance(BigDecimal accountingBalance) {
        this.accountingBalance = accountingBalance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isDebit() {
        return isDebit;
    }

    public void setDebit(boolean debit) {
        isDebit = debit;
    }
}

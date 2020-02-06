package com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.accounts;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;


public class AccountPayload {

    @JsonProperty(value = "Type")
    private String type;

    @JsonProperty(value = "TypeDescription")
    private String typeDescription;

    @JsonProperty(value = "Number")
    private String number;

    @JsonProperty(value = "Iban")
    private String iban;

    @JsonProperty(value = "Currency")
    private String currency;

    @JsonProperty(value = "Balance")
    private BigDecimal balance;

    @JsonProperty(value = "AccountingBalance")
    private BigDecimal accountingBalance;

    @JsonProperty(value = "OverdraftAmount")
    private String overdraftAmount;

    @JsonProperty(value = "HolderName")
    private String holderName;

    @JsonProperty(value = "ArrangementId")
    private String arrangementId;

    @JsonProperty(value = "AccountId")
    private String accountId;

    @JsonProperty(value = "Alias")
    private String alias;

    @JsonProperty(value = "CanDebit")
    private boolean canDebit;

    @JsonProperty(value = "CanViewStatement")
    private boolean canViewStatement;

    @JsonProperty(value = "Status")
    private String status;



    public AccountPayload() {
    }

    public AccountPayload(String type, String typeDescription, String number, String iban, String currency, BigDecimal balance,
                          BigDecimal accountingBalance, String overdraftAmount, String holderName, String arrangementId,
                          String accountId, String alias, boolean canDebit, boolean canViewStatement, String status) {
        this.type = type;
        this.typeDescription = typeDescription;
        this.number = number;
        this.iban = iban;
        this.currency = currency;
        this.balance = balance;
        this.accountingBalance = accountingBalance;
        this.overdraftAmount = overdraftAmount;
        this.holderName = holderName;
        this.arrangementId = arrangementId;
        this.accountId = accountId;
        this.alias = alias;
        this.canDebit = canDebit;
        this.canViewStatement = canViewStatement;
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeDescription() {
        return typeDescription;
    }

    public void setTypeDescription(String typeDescription) {
        this.typeDescription = typeDescription;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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

    public String getOverdraftAmount() {
        return overdraftAmount;
    }

    public void setOverdraftAmount(String overdraftAmount) {
        this.overdraftAmount = overdraftAmount;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getArrangementId() {
        return arrangementId;
    }

    public void setArrangementId(String arrangementId) {
        this.arrangementId = arrangementId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public boolean isCanDebit() {
        return canDebit;
    }

    public void setCanDebit(boolean canDebit) {
        this.canDebit = canDebit;
    }

    public boolean isCanViewStatement() {
        return canViewStatement;
    }

    public void setCanViewStatement(boolean canViewStatement) {
        this.canViewStatement = canViewStatement;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AccountPayload{" +
                "type='" + type + '\'' +
                ", typeDescription='" + typeDescription + '\'' +
                ", number='" + number + '\'' +
                ", iban='" + iban + '\'' +
                ", currency='" + currency + '\'' +
                ", balance=" + balance +
                ", accountingBalance=" + accountingBalance +
                ", overdraftAmount='" + overdraftAmount + '\'' +
                ", holderName='" + holderName + '\'' +
                ", arrangementId='" + arrangementId + '\'' +
                ", accountId='" + accountId + '\'' +
                ", alias='" + alias + '\'' +
                ", canDebit=" + canDebit +
                ", canViewStatement=" + canViewStatement +
                ", status='" + status + '\'' +
                '}';
    }
}

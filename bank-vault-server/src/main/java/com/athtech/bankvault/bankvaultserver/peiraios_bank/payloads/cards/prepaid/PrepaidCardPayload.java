package com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.cards.prepaid;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PrepaidCardPayload {

    @JsonProperty(value = "CardId")
    private String cardId;

    @JsonProperty(value = "AssetDisplayNumber")
    private String assetDisplayNumber;

    @JsonProperty(value = "productTypeDescription")
    private String ProductTypeDescription;

    @JsonProperty(value = "productName")
    private String ProductName;

    @JsonProperty(value = "IBAN")
    private String iban;

    @JsonProperty(value = "FormattedIBAN")
    private String formattedIBAN;

    @JsonProperty(value = "Currency")
    private String currency;

    @JsonProperty(value = "LedgerBalance")
    private float ledgerBalance;

    @JsonProperty(value = "Balance")
    private float balance;

    @JsonProperty(value = "AssetType")
    private float assetType;

    @JsonProperty(value = "AssetAlias")
    private String assetAlias;

    @JsonProperty(value = "CanDebit")
    private boolean canDebit;

    @JsonProperty(value = "CanViewStatement")
    private boolean canViewStatement;

    @JsonProperty(value = "Status")
    private String status;

    @JsonProperty(value = "StatusCode")
    private String statusCode;

    @JsonProperty(value = "StartDate")
    private String startDate;

    @JsonProperty(value = "EndDate")
    private String endDate;

    @JsonProperty(value = "LinkedAccount")
    private String linkedAccount;

    public PrepaidCardPayload() {
    }

    public PrepaidCardPayload(String cardId, String assetDisplayNumber, String productTypeDescription, String productName, String iban, String formattedIBAN, String currency, float ledgerBalance, float balance, float assetType, String assetAlias, boolean canDebit, boolean canViewStatement, String status, String statusCode, String startDate, String endDate, String linkedAccount) {
        this.cardId = cardId;
        this.assetDisplayNumber = assetDisplayNumber;
        ProductTypeDescription = productTypeDescription;
        ProductName = productName;
        this.iban = iban;
        this.formattedIBAN = formattedIBAN;
        this.currency = currency;
        this.ledgerBalance = ledgerBalance;
        this.balance = balance;
        this.assetType = assetType;
        this.assetAlias = assetAlias;
        this.canDebit = canDebit;
        this.canViewStatement = canViewStatement;
        this.status = status;
        this.statusCode = statusCode;
        this.startDate = startDate;
        this.endDate = endDate;
        this.linkedAccount = linkedAccount;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getAssetDisplayNumber() {
        return assetDisplayNumber;
    }

    public void setAssetDisplayNumber(String assetDisplayNumber) {
        this.assetDisplayNumber = assetDisplayNumber;
    }

    public String getProductTypeDescription() {
        return ProductTypeDescription;
    }

    public void setProductTypeDescription(String productTypeDescription) {
        ProductTypeDescription = productTypeDescription;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getFormattedIBAN() {
        return formattedIBAN;
    }

    public void setFormattedIBAN(String formattedIBAN) {
        this.formattedIBAN = formattedIBAN;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public float getLedgerBalance() {
        return ledgerBalance;
    }

    public void setLedgerBalance(float ledgerBalance) {
        this.ledgerBalance = ledgerBalance;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getAssetType() {
        return assetType;
    }

    public void setAssetType(float assetType) {
        this.assetType = assetType;
    }

    public String getAssetAlias() {
        return assetAlias;
    }

    public void setAssetAlias(String assetAlias) {
        this.assetAlias = assetAlias;
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

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getLinkedAccount() {
        return linkedAccount;
    }

    public void setLinkedAccount(String linkedAccount) {
        this.linkedAccount = linkedAccount;
    }
}

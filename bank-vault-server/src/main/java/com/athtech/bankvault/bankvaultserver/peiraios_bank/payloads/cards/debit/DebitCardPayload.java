package com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.cards.debit;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DebitCardPayload {


    @JsonProperty(value = "DisplayNumber")
    private String displayNumber;

    @JsonProperty(value = "CustomerName")
    private String customerName;

    @JsonProperty(value = "AccountNumber")
    private String accountNumber;

    @JsonProperty(value = "CardTypeDescription")
    private String cardTypeDescription;

    @JsonProperty(value = "ActivationDate")
    private String activationDate;

    @JsonProperty(value = "ExpirationDate")
    private String expirationDate;

    @JsonProperty(value = "CancellationDate")
    private String cancellationDate;

    @JsonProperty(value = "Currency")
    private String currency;

    @JsonProperty(value = "PurchaseDailyLimit")
    private float purchaseDailyLimit;

    @JsonProperty(value = "totalDailyLimit")
    private float TotalDailyLimit;

    @JsonProperty(value = "Balance")
    private float balance;

    @JsonProperty(value = "AccountAvailableBalance")
    private float accountAvailableBalance;

    @JsonProperty(value = "CardId")
    private String cardId;

    @JsonProperty(value = "AssetAlias")
    private String assetAlias;

    @JsonProperty(value = "canDebit")
    private boolean CanDebit;

    @JsonProperty(value = "canViewStatement")
    private boolean CanViewStatement;

    @JsonProperty(value = "Status")
    private String status;

    @JsonProperty(value = "StartDate")
    private String startDate;

    @JsonProperty(value = "EndDate")
    private String endDate;

    public DebitCardPayload() {
    }

    public DebitCardPayload(String displayNumber, String customerName, String accountNumber, String cardTypeDescription, String activationDate, String expirationDate, String cancellationDate, String currency, float purchaseDailyLimit, float totalDailyLimit, float balance, float accountAvailableBalance, String cardId, String assetAlias, boolean canDebit, boolean canViewStatement, String status, String startDate, String endDate) {
        this.displayNumber = displayNumber;
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.cardTypeDescription = cardTypeDescription;
        this.activationDate = activationDate;
        this.expirationDate = expirationDate;
        this.cancellationDate = cancellationDate;
        this.currency = currency;
        this.purchaseDailyLimit = purchaseDailyLimit;
        TotalDailyLimit = totalDailyLimit;
        this.balance = balance;
        this.accountAvailableBalance = accountAvailableBalance;
        this.cardId = cardId;
        this.assetAlias = assetAlias;
        CanDebit = canDebit;
        CanViewStatement = canViewStatement;
        this.status = status;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getDisplayNumber() {
        return displayNumber;
    }

    public void setDisplayNumber(String displayNumber) {
        this.displayNumber = displayNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCardTypeDescription() {
        return cardTypeDescription;
    }

    public void setCardTypeDescription(String cardTypeDescription) {
        this.cardTypeDescription = cardTypeDescription;
    }

    public String getActivationDate() {
        return activationDate;
    }

    public void setActivationDate(String activationDate) {
        this.activationDate = activationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getCancellationDate() {
        return cancellationDate;
    }

    public void setCancellationDate(String cancellationDate) {
        this.cancellationDate = cancellationDate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public float getPurchaseDailyLimit() {
        return purchaseDailyLimit;
    }

    public void setPurchaseDailyLimit(float purchaseDailyLimit) {
        this.purchaseDailyLimit = purchaseDailyLimit;
    }

    public float getTotalDailyLimit() {
        return TotalDailyLimit;
    }

    public void setTotalDailyLimit(float totalDailyLimit) {
        TotalDailyLimit = totalDailyLimit;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getAccountAvailableBalance() {
        return accountAvailableBalance;
    }

    public void setAccountAvailableBalance(float accountAvailableBalance) {
        this.accountAvailableBalance = accountAvailableBalance;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getAssetAlias() {
        return assetAlias;
    }

    public void setAssetAlias(String assetAlias) {
        this.assetAlias = assetAlias;
    }

    public boolean isCanDebit() {
        return CanDebit;
    }

    public void setCanDebit(boolean canDebit) {
        CanDebit = canDebit;
    }

    public boolean isCanViewStatement() {
        return CanViewStatement;
    }

    public void setCanViewStatement(boolean canViewStatement) {
        CanViewStatement = canViewStatement;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
}



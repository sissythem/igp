package com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.cards.credit;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CreditCardPayload {

    @JsonProperty(value = "PrimaryCardId")
    private String privaryCardid;

    @JsonProperty(value = "CardId")
    private String cardid;

    @JsonProperty(value = "DisplayNumber")
    private String displayNumber;

    @JsonProperty(value = "AssetAlias")
    private String assetAlias;

    @JsonProperty(value = "CardHolderName")
    private String cardHolderName;

    @JsonProperty(value = "CardStatus")
    private String cardStatus;

    @JsonProperty(value = "IsAddonCard")
    private boolean isAddonCard;

    @JsonProperty(value = "AddonCardHolderName")
    private String addonCardHolderName;

    @JsonProperty(value = "cardBin")
    private String cardBin;

    @JsonProperty(value = "CardType")
    private String cardType;

    @JsonProperty(value = "Currency")
    private String currency;

    @JsonProperty(value = "Balance")
    private float balance;

    @JsonProperty(value = "creditLimit")
    private float creditLimit;

    @JsonProperty(value = "CurrentStatementMinimumPayment")
    private float currentStatementMinimumPayment;

    @JsonProperty(value = "DisplayNumber")
    private float lastPayAmount;

    @JsonProperty(value = "DisplayNumber")
    private float openToBuy;

    @JsonProperty(value = "BalanceNoAuthorizations")
    private float balanceNoAuthorizations;

    @JsonProperty(value = "LastStatementBalance")
    private float lastStatementBalance;

    @JsonProperty(value = "StartDate")
    private String startDate;

    @JsonProperty(value = "EndDate")
    private String endDate;

    @JsonProperty(value = "AutomaticPaymentDescription")
    private String automaticPaymentDescription;

    @JsonProperty(value = "BillingAddress")
    private String billingAddress;

    @JsonProperty(value = "CurrentStatementPayDate")
    private String currentStatementPayDate;

    @JsonProperty(value = "PreviousStatementPayDate")
    private String previousStatementPayDate;

    @JsonProperty(value = "WithdrawalInterestRate")
    private float withdrawalInterestRate;

    @JsonProperty(value = "PurchasesInterestRate")
    private float purchasesInterestRate;

    @JsonProperty(value = "HasLoyaltyProgram")
    private boolean hasLoyaltyProgram;

    @JsonProperty(value = "AddonCards")
    private List<CreditCardAddonPayload> addonCards;

    public CreditCardPayload() {
    }

    public CreditCardPayload(String privaryCardid, String cardid, String displayNumber, String assetAlias, String cardHolderName, String cardStatus, boolean isAddonCard, String addonCardHolderName, String cardBin, String cardType, String currency, float balance, float creditLimit, float currentStatementMinimumPayment, float lastPayAmount, float openToBuy, float balanceNoAuthorizations, float lastStatementBalance, String startDate, String endDate, String automaticPaymentDescription, String billingAddress, String currentStatementPayDate, String previousStatementPayDate, float withdrawalInterestRate, float purchasesInterestRate, boolean hasLoyaltyProgram, List<CreditCardAddonPayload> addonCards) {
        this.privaryCardid = privaryCardid;
        this.cardid = cardid;
        this.displayNumber = displayNumber;
        this.assetAlias = assetAlias;
        this.cardHolderName = cardHolderName;
        this.cardStatus = cardStatus;
        this.isAddonCard = isAddonCard;
        this.addonCardHolderName = addonCardHolderName;
        this.cardBin = cardBin;
        this.cardType = cardType;
        this.currency = currency;
        this.balance = balance;
        this.creditLimit = creditLimit;
        this.currentStatementMinimumPayment = currentStatementMinimumPayment;
        this.lastPayAmount = lastPayAmount;
        this.openToBuy = openToBuy;
        this.balanceNoAuthorizations = balanceNoAuthorizations;
        this.lastStatementBalance = lastStatementBalance;
        this.startDate = startDate;
        this.endDate = endDate;
        this.automaticPaymentDescription = automaticPaymentDescription;
        this.billingAddress = billingAddress;
        this.currentStatementPayDate = currentStatementPayDate;
        this.previousStatementPayDate = previousStatementPayDate;
        this.withdrawalInterestRate = withdrawalInterestRate;
        this.purchasesInterestRate = purchasesInterestRate;
        this.hasLoyaltyProgram = hasLoyaltyProgram;
        this.addonCards = addonCards;
    }

    public String getPrivaryCardid() {
        return privaryCardid;
    }

    public void setPrivaryCardid(String privaryCardid) {
        this.privaryCardid = privaryCardid;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public String getDisplayNumber() {
        return displayNumber;
    }

    public void setDisplayNumber(String displayNumber) {
        this.displayNumber = displayNumber;
    }

    public String getAssetAlias() {
        return assetAlias;
    }

    public void setAssetAlias(String assetAlias) {
        this.assetAlias = assetAlias;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(String cardStatus) {
        this.cardStatus = cardStatus;
    }

    public boolean isAddonCard() {
        return isAddonCard;
    }

    public void setAddonCard(boolean addonCard) {
        isAddonCard = addonCard;
    }

    public String getAddonCardHolderName() {
        return addonCardHolderName;
    }

    public void setAddonCardHolderName(String addonCardHolderName) {
        this.addonCardHolderName = addonCardHolderName;
    }

    public String getCardBin() {
        return cardBin;
    }

    public void setCardBin(String cardBin) {
        this.cardBin = cardBin;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(float creditLimit) {
        this.creditLimit = creditLimit;
    }

    public float getCurrentStatementMinimumPayment() {
        return currentStatementMinimumPayment;
    }

    public void setCurrentStatementMinimumPayment(float currentStatementMinimumPayment) {
        this.currentStatementMinimumPayment = currentStatementMinimumPayment;
    }

    public float getLastPayAmount() {
        return lastPayAmount;
    }

    public void setLastPayAmount(float lastPayAmount) {
        this.lastPayAmount = lastPayAmount;
    }

    public float getOpenToBuy() {
        return openToBuy;
    }

    public void setOpenToBuy(float openToBuy) {
        this.openToBuy = openToBuy;
    }

    public float getBalanceNoAuthorizations() {
        return balanceNoAuthorizations;
    }

    public void setBalanceNoAuthorizations(float balanceNoAuthorizations) {
        this.balanceNoAuthorizations = balanceNoAuthorizations;
    }

    public float getLastStatementBalance() {
        return lastStatementBalance;
    }

    public void setLastStatementBalance(float lastStatementBalance) {
        this.lastStatementBalance = lastStatementBalance;
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

    public String getAutomaticPaymentDescription() {
        return automaticPaymentDescription;
    }

    public void setAutomaticPaymentDescription(String automaticPaymentDescription) {
        this.automaticPaymentDescription = automaticPaymentDescription;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getCurrentStatementPayDate() {
        return currentStatementPayDate;
    }

    public void setCurrentStatementPayDate(String currentStatementPayDate) {
        this.currentStatementPayDate = currentStatementPayDate;
    }

    public String getPreviousStatementPayDate() {
        return previousStatementPayDate;
    }

    public void setPreviousStatementPayDate(String previousStatementPayDate) {
        this.previousStatementPayDate = previousStatementPayDate;
    }

    public float getWithdrawalInterestRate() {
        return withdrawalInterestRate;
    }

    public void setWithdrawalInterestRate(float withdrawalInterestRate) {
        this.withdrawalInterestRate = withdrawalInterestRate;
    }

    public float getPurchasesInterestRate() {
        return purchasesInterestRate;
    }

    public void setPurchasesInterestRate(float purchasesInterestRate) {
        this.purchasesInterestRate = purchasesInterestRate;
    }

    public boolean isHasLoyaltyProgram() {
        return hasLoyaltyProgram;
    }

    public void setHasLoyaltyProgram(boolean hasLoyaltyProgram) {
        this.hasLoyaltyProgram = hasLoyaltyProgram;
    }

    public List<CreditCardAddonPayload> getAddonCards() {
        return addonCards;
    }

    public void setAddonCards(List<CreditCardAddonPayload> addonCards) {
        this.addonCards = addonCards;
    }
}

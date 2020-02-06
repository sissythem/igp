package com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.cards.credit;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreditCardAddonPayload {

    @JsonProperty(value = "CardId")
    private String cardId;

    @JsonProperty(value = "CardholderName")
    private String cardholderName;

    @JsonProperty(value = "DisplayNumber")
    private String displayNumber;

    @JsonProperty(value = "EndDate")
    private String endDate;

    @JsonProperty(value = "Currency")
    private String currency;

    @JsonProperty(value = "AvailableSpendingLimit")
    private String availableSpendingLimit;

    public CreditCardAddonPayload() {
    }

    public CreditCardAddonPayload(String cardId, String cardholderName, String displayNumber, String endDate, String currency, String availableSpendingLimit) {
        this.cardId = cardId;
        this.cardholderName = cardholderName;
        this.displayNumber = displayNumber;
        this.endDate = endDate;
        this.currency = currency;
        this.availableSpendingLimit = availableSpendingLimit;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getCardholderName() {
        return cardholderName;
    }

    public void setCardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
    }

    public String getDisplayNumber() {
        return displayNumber;
    }

    public void setDisplayNumber(String displayNumber) {
        this.displayNumber = displayNumber;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAvailableSpendingLimit() {
        return availableSpendingLimit;
    }

    public void setAvailableSpendingLimit(String availableSpendingLimit) {
        this.availableSpendingLimit = availableSpendingLimit;
    }
}

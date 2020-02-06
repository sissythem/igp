package com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.cards.credit;

import com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.cards.credit.CreditCardPayload;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CreditCardResponsePayload {

    @JsonProperty(value = "CreditCards")
    private List<CreditCardPayload> creditCards;

    public CreditCardResponsePayload(){}

    public CreditCardResponsePayload(List<CreditCardPayload> creditCards) {
        this.creditCards = creditCards;
    }

    public List<CreditCardPayload> getCreditCards() {
        return creditCards;
    }

    public void setCreditCards(List<CreditCardPayload> creditCards) {
        this.creditCards = creditCards;
    }
}

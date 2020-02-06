package com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.cards.debit;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class DebitCardResponsePaylod {

    @JsonProperty(value = "DebitCards")
    private List<DebitCardPayload> debitCards;

    public DebitCardResponsePaylod() {
    }

    public DebitCardResponsePaylod(List<DebitCardPayload> debitCards) {
        this.debitCards = debitCards;
    }

    public List<DebitCardPayload> getDebitCards() {
        return debitCards;
    }

    public void setDebitCards(List<DebitCardPayload> debitCards) {
        this.debitCards = debitCards;
    }
}

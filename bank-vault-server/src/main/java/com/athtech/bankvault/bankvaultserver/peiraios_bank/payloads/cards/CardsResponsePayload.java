package com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.cards;

import com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.cards.credit.CreditCardResponsePayload;
import com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.cards.debit.DebitCardResponsePaylod;
import com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.cards.prepaid.PrepaidCardResponsePayload;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CardsResponsePayload {

    @JsonProperty(value = "CreditCards")
    private CreditCardResponsePayload creditCards;

    @JsonProperty(value = "DebitCards")
    private DebitCardResponsePaylod debitCards;

    @JsonProperty(value = "PrepaidCards")
    private PrepaidCardResponsePayload prepaidCards;

    public CardsResponsePayload(CreditCardResponsePayload creditCards, DebitCardResponsePaylod debitCards, PrepaidCardResponsePayload prepaidCards) {
        this.creditCards = creditCards;
        this.debitCards = debitCards;
        this.prepaidCards = prepaidCards;
    }

    public CardsResponsePayload() {
    }

    public CreditCardResponsePayload getCreditCards() {
        return creditCards;
    }

    public void setCreditCards(CreditCardResponsePayload creditCards) {
        this.creditCards = creditCards;
    }

    public DebitCardResponsePaylod getDebitCards() {
        return debitCards;
    }

    public void setDebitCards(DebitCardResponsePaylod debitCards) {
        this.debitCards = debitCards;
    }

    public PrepaidCardResponsePayload getPrepaidCards() {
        return prepaidCards;
    }

    public void setPrepaidCards(PrepaidCardResponsePayload prepaidCards) {
        this.prepaidCards = prepaidCards;
    }
}

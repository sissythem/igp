package com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.cards.prepaid;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PrepaidCardResponsePayload {

    @JsonProperty(value = "PrepaidCards")
    private List<PrepaidCardPayload> prepaidCards;

    public PrepaidCardResponsePayload() {
    }

    public PrepaidCardResponsePayload(List<PrepaidCardPayload> prepaidCards) {
        this.prepaidCards = prepaidCards;
    }

    public List<PrepaidCardPayload> getPrepaidCards() {
        return prepaidCards;
    }

    public void setDebitCards(List<PrepaidCardPayload> prepaidCards) {
        this.prepaidCards = prepaidCards;
    }
}

package com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.accounts;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;


public class IbanInfoPayload {


    //FIXME: Serialization issue when JsonAlias is used
    @JsonProperty(value = "IsValid")
    private boolean isValid;

    @JsonAlias(value = "Bank")
    private BankPayload bank;

    public IbanInfoPayload() {
    }

    public IbanInfoPayload(boolean isValid, BankPayload bank) {
        this.isValid = isValid;
        this.bank = bank;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public BankPayload getBank() {
        return bank;
    }

    public void setBank(BankPayload bank) {
        this.bank = bank;
    }
}

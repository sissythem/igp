package com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.accounts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountCharacteristicsPayload {


    @JsonProperty(value = "Name")
    private String name;

    @JsonProperty(value = "Value")
    private String value;

    public AccountCharacteristicsPayload() {
    }

    public AccountCharacteristicsPayload(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

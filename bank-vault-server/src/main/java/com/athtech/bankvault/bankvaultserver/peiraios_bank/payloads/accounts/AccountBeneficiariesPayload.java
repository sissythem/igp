package com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.accounts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountBeneficiariesPayload {

    @JsonProperty(value = "Name")
    private String name;

    @JsonProperty(value = "Type")
    private String type;

    @JsonProperty(value = "Address")
    private String address;

    public AccountBeneficiariesPayload(){

    }

    public AccountBeneficiariesPayload(String name, String type, String address) {
        this.name = name;
        this.type = type;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

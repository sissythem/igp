package com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.accounts;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BankPayload {

    @JsonAlias(value = "Name")
    private String name;

    @JsonAlias(value = "Bic")
    private String bic;

    @JsonAlias(value = "DomesticBankCode")
    private String domesticBankCode;

    @JsonAlias(value = "Address")
    private String address;

    @JsonAlias(value = "City")
    private String city;

    @JsonAlias(value = "CountryIsoCode")
    private String countryIsoCode;

    public BankPayload() {
    }

    public BankPayload(String name, String bic, String domesticBankCode, String address, String city, String countryIsoCode) {
        this.name = name;
        this.bic = bic;
        this.domesticBankCode = domesticBankCode;
        this.address = address;
        this.city = city;
        this.countryIsoCode = countryIsoCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public String getDomesticBankCode() {
        return domesticBankCode;
    }

    public void setDomesticBankCode(String domesticBankCode) {
        this.domesticBankCode = domesticBankCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountryIsoCode() {
        return countryIsoCode;
    }

    public void setCountryIsoCode(String countryIsoCode) {
        this.countryIsoCode = countryIsoCode;
    }
}

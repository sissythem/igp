package com.athtech.bankvault.bankvaultserver.commons.payloads;

public class TokenRequestPayload {

    private Bank bank;
    private String code;

    public TokenRequestPayload() {
    }

    public TokenRequestPayload(Bank bank, String code) {
        this.bank = bank;
        this.code = code;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

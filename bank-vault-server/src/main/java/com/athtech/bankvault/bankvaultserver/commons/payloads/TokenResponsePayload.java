package com.athtech.bankvault.bankvaultserver.commons.payloads;

public class TokenResponsePayload {

    private String token;

    public TokenResponsePayload(){}

    public TokenResponsePayload(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}

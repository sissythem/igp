package com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Value;

public class PeiraiosTokenResponsePayload {

    @JsonProperty(value = "access_token")
    private String accessToken;

    @JsonProperty(value = "token_type")
    private String tokenType;

    @JsonProperty(value = "refresh_token")
    private String refreshToken;

    @JsonProperty(value = "expires_in")
    private String expiresIn;

    private String scope;

    private String metada;

    public PeiraiosTokenResponsePayload() {
    }

    public PeiraiosTokenResponsePayload(String accessToken, String tokenType, String refreshToken, String expiresIn, String scope, String metada) {
        this.accessToken = accessToken;
        this.tokenType = tokenType;
        this.refreshToken = refreshToken;
        this.expiresIn = expiresIn;
        this.scope = scope;
        this.metada = metada;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(String expiresIn) {
        this.expiresIn = expiresIn;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getMetada() {
        return metada;
    }

    public void setMetada(String metada) {
        this.metada = metada;
    }

    @Override
    public String toString() {
        return "PeiraiosTokenResponsePayload{" +
                "accessToken='" + accessToken + '\'' +
                ", tokenType='" + tokenType + '\'' +
                ", refreshToken='" + refreshToken + '\'' +
                ", expiresIn='" + expiresIn + '\'' +
                ", scope='" + scope + '\'' +
                ", metada='" + metada + '\'' +
                '}';
    }
}

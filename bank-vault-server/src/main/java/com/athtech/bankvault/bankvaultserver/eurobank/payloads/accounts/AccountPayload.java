package com.athtech.bankvault.bankvaultserver.eurobank.payloads.accounts;

import java.util.List;

public class AccountPayload {

    private String resourceId;

    private String iban;

    private String bban;

    private String msisdn;

    private String currency;

    private String name;

    private String product;

    private String cashAccountType;

    private String status;

    private String bic;

    private String linkedAccounts;

    private String usage;

    private String details;

    private List<AccountBalancePayload> balances;

    private AccountLinksPayload _links;

    public AccountPayload() {
    }

    public AccountPayload(String resourceId, String iban, String bban, String msisdn, String currency,
                          String name, String product, String cashAccountType, String status,
                          String bic, String linkedAccounts, String usage, String details,
                          List<AccountBalancePayload> balances, AccountLinksPayload _links) {
        this.resourceId = resourceId;
        this.iban = iban;
        this.bban = bban;
        this.msisdn = msisdn;
        this.currency = currency;
        this.name = name;
        this.product = product;
        this.cashAccountType = cashAccountType;
        this.status = status;
        this.bic = bic;
        this.linkedAccounts = linkedAccounts;
        this.usage = usage;
        this.details = details;
        this.balances = balances;
        this._links = _links;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getBban() {
        return bban;
    }

    public void setBban(String bban) {
        this.bban = bban;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getCashAccountType() {
        return cashAccountType;
    }

    public void setCashAccountType(String cashAccountType) {
        this.cashAccountType = cashAccountType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public String getLinkedAccounts() {
        return linkedAccounts;
    }

    public void setLinkedAccounts(String linkedAccounts) {
        this.linkedAccounts = linkedAccounts;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public List<AccountBalancePayload> getBalances() {
        return balances;
    }

    public void setBalances(List<AccountBalancePayload> balances) {
        this.balances = balances;
    }

    public AccountLinksPayload get_links() {
        return _links;
    }

    public void set_links(AccountLinksPayload _links) {
        this._links = _links;
    }
}

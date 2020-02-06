package com.athtech.bankvault.bankvaultserver.commons.payloads;

import java.util.ArrayList;
import java.util.List;

public class BankVaultAccountDetailsResponsePayload {

    private BankVaultAccountDetailsPayload accountDetailsPayload;

    private List<BankVaultAccountDetailsTransactionsPayload> accountDetailsTransactionsPayload = new ArrayList<>();

    public BankVaultAccountDetailsResponsePayload(BankVaultAccountDetailsPayload accountDetailsPayload, List<BankVaultAccountDetailsTransactionsPayload> accountDetailsTransactionsPayload) {
        this.accountDetailsPayload = accountDetailsPayload;
        this.accountDetailsTransactionsPayload = accountDetailsTransactionsPayload;
    }

    public BankVaultAccountDetailsResponsePayload() {
    }

    public BankVaultAccountDetailsPayload getAccountDetailsPayload() {
        return accountDetailsPayload;
    }

    public void setAccountDetailsPayload(BankVaultAccountDetailsPayload accountDetailsPayload) {
        this.accountDetailsPayload = accountDetailsPayload;
    }

    public List<BankVaultAccountDetailsTransactionsPayload> getAccountDetailsTransactionsPayload() {
        return accountDetailsTransactionsPayload;
    }

    public void setAccountDetailsTransactionsPayload(List<BankVaultAccountDetailsTransactionsPayload> accountDetailsTransactionsPayload) {
        this.accountDetailsTransactionsPayload = accountDetailsTransactionsPayload;
    }
}

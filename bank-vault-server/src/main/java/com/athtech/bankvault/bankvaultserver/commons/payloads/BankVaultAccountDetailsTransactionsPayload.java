package com.athtech.bankvault.bankvaultserver.commons.payloads;

import java.math.BigDecimal;

public class BankVaultAccountDetailsTransactionsPayload {

    private String transactionId;

    private String transactionReference;

    private String description;

    private BigDecimal amount;

    private String postDate;

    private String valueDate;

    public BankVaultAccountDetailsTransactionsPayload(){}

    public BankVaultAccountDetailsTransactionsPayload(String transactionId, String transactionReference, String description, BigDecimal amount, String postDate, String valueDate) {
        this.transactionId = transactionId;
        this.transactionReference = transactionReference;
        this.description = description;
        this.amount = amount;
        this.postDate = postDate;
        this.valueDate = valueDate;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionReference() {
        return transactionReference;
    }

    public void setTransactionReference(String transactionReference) {
        this.transactionReference = transactionReference;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

    public String getValueDate() {
        return valueDate;
    }

    public void setValueDate(String valueDate) {
        this.valueDate = valueDate;
    }
}

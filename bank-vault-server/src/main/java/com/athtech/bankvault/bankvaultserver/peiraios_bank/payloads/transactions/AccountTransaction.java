package com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.transactions;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountTransaction {

    @JsonProperty(value = "BranchCode")
    private String branchCode;

    @JsonProperty(value = "BranchName")
    private String branchName;

    @JsonProperty(value = "TransactionReference")
    private String transactionReference;

    @JsonProperty(value = "Comments")
    private String comments;

    @JsonProperty(value = "UniqueReference")
    private String uniqueReference;

    @JsonProperty(value = "TransactionId")
    private String transactionId;

    @JsonProperty(value = "TransactionCode")
    private String transactionCode;

    @JsonProperty(value = "TransactionType")
    private String transactionType;

    @JsonProperty(value = "Description")
    private String description;

    @JsonProperty(value = "PostDate")
    private String postDate;

    @JsonProperty(value = "ValueDate")
    private String valueDate;

    @JsonProperty(value = "Amount")
    private float amount;

    @JsonProperty(value = "Currency")
    private String currency;

    @JsonProperty(value = "RunningBalance")
    private float runningBalance;


    public AccountTransaction() {
    }

    public AccountTransaction(String branchCode, String branchName, String transactionReference, String comments, String uniqueReference, String transactionId, String transactionCode, String transactionType, String description, String postDate, String valueDate, float amount, String currency, float runningBalance) {
        this.branchCode = branchCode;
        this.branchName = branchName;
        this.transactionReference = transactionReference;
        this.comments = comments;
        this.uniqueReference = uniqueReference;
        this.transactionId = transactionId;
        this.transactionCode = transactionCode;
        this.transactionType = transactionType;
        this.description = description;
        this.postDate = postDate;
        this.valueDate = valueDate;
        this.amount = amount;
        this.currency = currency;
        this.runningBalance = runningBalance;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getTransactionReference() {
        return transactionReference;
    }

    public void setTransactionReference(String transactionReference) {
        this.transactionReference = transactionReference;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getUniqueReference() {
        return uniqueReference;
    }

    public void setUniqueReference(String uniqueReference) {
        this.uniqueReference = uniqueReference;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public float getRunningBalance() {
        return runningBalance;
    }

    public void setRunningBalance(float runningBalance) {
        this.runningBalance = runningBalance;
    }

    @Override
    public String toString() {
        return "AccountTransaction{" +
                "branchCode='" + branchCode + '\'' +
                ", branchName='" + branchName + '\'' +
                ", transactionReference='" + transactionReference + '\'' +
                ", comments='" + comments + '\'' +
                ", uniqueReference='" + uniqueReference + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", transactionCode='" + transactionCode + '\'' +
                ", transactionType='" + transactionType + '\'' +
                ", description='" + description + '\'' +
                ", postDate='" + postDate + '\'' +
                ", valueDate='" + valueDate + '\'' +
                ", amount=" + amount +
                ", currency='" + currency + '\'' +
                ", runningBalance=" + runningBalance +
                '}';
    }
}

package com.athtech.bankvault.bankvaultserver.eurobank.payloads.accounts;

import java.time.ZonedDateTime;
import java.util.Date;

public class AccountBalancePayload {

    private AccountBalanceAmountPayload balanceAmount;

    private String balanceType;

    private boolean creditLimitIncluded;

    private Date referenceDate;

    private String lastChangeDateTime;

    private String lastCommittedTransaction;

    public AccountBalancePayload() {
    }

    public AccountBalancePayload(AccountBalanceAmountPayload balanceAmount, String balanceType,
                                 boolean creditLimitIncluded, Date referenceDate,
                                 String lastChangeDateTime, String lastCommittedTransaction) {
        this.balanceAmount = balanceAmount;
        this.balanceType = balanceType;
        this.creditLimitIncluded = creditLimitIncluded;
        this.referenceDate = referenceDate;
        this.lastChangeDateTime = lastChangeDateTime;
        this.lastCommittedTransaction = lastCommittedTransaction;
    }

    public AccountBalanceAmountPayload getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(AccountBalanceAmountPayload balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    public String getBalanceType() {
        return balanceType;
    }

    public void setBalanceType(String balanceType) {
        this.balanceType = balanceType;
    }

    public boolean isCreditLimitIncluded() {
        return creditLimitIncluded;
    }

    public void setCreditLimitIncluded(boolean creditLimitIncluded) {
        this.creditLimitIncluded = creditLimitIncluded;
    }

    public Date getReferenceDate() {
        return referenceDate;
    }

    public void setReferenceDate(Date referenceDate) {
        this.referenceDate = referenceDate;
    }

    public String getLastChangeDateTime() {
        return lastChangeDateTime;
    }

    public void setLastChangeDateTime(String lastChangeDateTime) {
        this.lastChangeDateTime = lastChangeDateTime;
    }

    public String getLastCommittedTransaction() {
        return lastCommittedTransaction;
    }

    public void setLastCommittedTransaction(String lastCommittedTransaction) {
        this.lastCommittedTransaction = lastCommittedTransaction;
    }
}

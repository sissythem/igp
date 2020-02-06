package com.athtech.bankvault.bankvaultserver.peiraios_bank.payloads.accounts;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class AccountDetailsPayload {

    @JsonProperty(value = "AssetNumberCleared")
    private String assetNumberCleared;

    @JsonProperty(value = "Iban")
    private String iban;

    @JsonProperty(value = "Currency")
    private String currency;

    @JsonProperty(value = "AccountTypeDescription")
    private String accountTypeDescription;

    @JsonProperty(value = "AccountingBalance")
    private float accountingBalance;

    @JsonProperty(value = "accountingBalanceValidityDate")
    private String accountingBalanceValidityDate;

    @JsonProperty(value = "Balance")
    private float balance;

    @JsonProperty(value = "BalanceValidityDate")
    private String balanceValidityDate;

    @JsonProperty(value = "PledgedAmount")
    private float pledgedAmount;

    @JsonProperty(value = "ValeurUnavailableBalance")
    private float valeurUnavailableBalance;

    @JsonProperty(value = "OverdraftAmount")
    private float overdraftAmount;

    @JsonProperty(value = "OverdraftEndDate")
    private String overdraftEndDate;

    @JsonProperty(value = "MonthlyDebitSum")
    private float monthlyDebitSum;

    @JsonProperty(value = "MonthlyCreditSum")
    private float monthlyCreditSum;

    @JsonProperty(value = "BranchName")
    private String branchName;

    @JsonProperty(value = "Address")
    private String address;

    @JsonProperty(value = "BranchCode")
    private String branchCode;

    @JsonProperty(value = "BranchAddress")
    private String branchAddress;

    @JsonProperty(value = "AccountId")
    private String accountId;

    @JsonProperty(value = "AssetAlias")
    private String assetAlias;

    @JsonProperty(value = "CanDebit")
    private boolean canDebit;

    @JsonProperty(value = "CanViewStatement")
    private boolean canViewStatement;

    @JsonProperty(value = "Status")
    private String status;

    @JsonProperty(value = "StartDate")
    private String startDate;

    @JsonProperty(value = "EndDate")
    private String endDate = null;

    @JsonProperty(value = "Characteristics")
    private List<AccountCharacteristicsPayload> characteristics;

    @JsonProperty(value = "Beneficiaries")
    private List<AccountBeneficiariesPayload> beneficiaries;

    public AccountDetailsPayload() {
    }

    public AccountDetailsPayload(String assetNumberCleared, String iban, String currency, String accountTypeDescription,
                                 float accountingBalance, String accountingBalanceValidityDate, float balance,
                                 String balanceValidityDate, float pledgedAmount, float valeurUnavailableBalance,
                                 float overdraftAmount, String overdraftEndDate, float monthlyDebitSum,
                                 float monthlyCreditSum, String branchName, String address, String branchCode,
                                 String branchAddress, String accountId, String assetAlias, boolean canDebit,
                                 boolean canViewStatement, String status, String startDate, String endDate,
                                 List<AccountCharacteristicsPayload> characteristics,
                                 List<AccountBeneficiariesPayload> beneficiaries) {
        this.assetNumberCleared = assetNumberCleared;
        this.iban = iban;
        this.currency = currency;
        this.accountTypeDescription = accountTypeDescription;
        this.accountingBalance = accountingBalance;
        this.accountingBalanceValidityDate = accountingBalanceValidityDate;
        this.balance = balance;
        this.balanceValidityDate = balanceValidityDate;
        this.pledgedAmount = pledgedAmount;
        this.valeurUnavailableBalance = valeurUnavailableBalance;
        this.overdraftAmount = overdraftAmount;
        this.overdraftEndDate = overdraftEndDate;
        this.monthlyDebitSum = monthlyDebitSum;
        this.monthlyCreditSum = monthlyCreditSum;
        this.branchName = branchName;
        this.address = address;
        this.branchCode = branchCode;
        this.branchAddress = branchAddress;
        this.accountId = accountId;
        this.assetAlias = assetAlias;
        this.canDebit = canDebit;
        this.canViewStatement = canViewStatement;
        this.status = status;
        this.startDate = startDate;
        this.endDate = endDate;
        this.characteristics = characteristics;
        this.beneficiaries = beneficiaries;
    }

    public String getAssetNumberCleared() {
        return assetNumberCleared;
    }

    public void setAssetNumberCleared(String assetNumberCleared) {
        this.assetNumberCleared = assetNumberCleared;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAccountTypeDescription() {
        return accountTypeDescription;
    }

    public void setAccountTypeDescription(String accountTypeDescription) {
        this.accountTypeDescription = accountTypeDescription;
    }

    public float getAccountingBalance() {
        return accountingBalance;
    }

    public void setAccountingBalance(float accountingBalance) {
        this.accountingBalance = accountingBalance;
    }

    public String getAccountingBalanceValidityDate() {
        return accountingBalanceValidityDate;
    }

    public void setAccountingBalanceValidityDate(String accountingBalanceValidityDate) {
        this.accountingBalanceValidityDate = accountingBalanceValidityDate;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getBalanceValidityDate() {
        return balanceValidityDate;
    }

    public void setBalanceValidityDate(String balanceValidityDate) {
        this.balanceValidityDate = balanceValidityDate;
    }

    public float getPledgedAmount() {
        return pledgedAmount;
    }

    public void setPledgedAmount(float pledgedAmount) {
        this.pledgedAmount = pledgedAmount;
    }

    public float getValeurUnavailableBalance() {
        return valeurUnavailableBalance;
    }

    public void setValeurUnavailableBalance(float valeurUnavailableBalance) {
        this.valeurUnavailableBalance = valeurUnavailableBalance;
    }

    public float getOverdraftAmount() {
        return overdraftAmount;
    }

    public void setOverdraftAmount(float overdraftAmount) {
        this.overdraftAmount = overdraftAmount;
    }

    public String getOverdraftEndDate() {
        return overdraftEndDate;
    }

    public void setOverdraftEndDate(String overdraftEndDate) {
        this.overdraftEndDate = overdraftEndDate;
    }

    public float getMonthlyDebitSum() {
        return monthlyDebitSum;
    }

    public void setMonthlyDebitSum(float monthlyDebitSum) {
        this.monthlyDebitSum = monthlyDebitSum;
    }

    public float getMonthlyCreditSum() {
        return monthlyCreditSum;
    }

    public void setMonthlyCreditSum(float monthlyCreditSum) {
        this.monthlyCreditSum = monthlyCreditSum;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getBranchAddress() {
        return branchAddress;
    }

    public void setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAssetAlias() {
        return assetAlias;
    }

    public void setAssetAlias(String assetAlias) {
        this.assetAlias = assetAlias;
    }

    public boolean isCanDebit() {
        return canDebit;
    }

    public void setCanDebit(boolean canDebit) {
        this.canDebit = canDebit;
    }

    public boolean isCanViewStatement() {
        return canViewStatement;
    }

    public void setCanViewStatement(boolean canViewStatement) {
        this.canViewStatement = canViewStatement;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public List<AccountCharacteristicsPayload> getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(List<AccountCharacteristicsPayload> characteristics) {
        this.characteristics = characteristics;
    }

    public List<AccountBeneficiariesPayload> getBeneficiaries() {
        return beneficiaries;
    }

    public void setBeneficiaries(List<AccountBeneficiariesPayload> beneficiaries) {
        this.beneficiaries = beneficiaries;
    }
}

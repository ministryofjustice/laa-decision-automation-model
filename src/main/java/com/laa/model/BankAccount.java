package com.laa.model;

import java.math.BigDecimal;

import com.laa.model.civil.enums.AccountOwnerType;
import com.laa.model.enums.AccountType;

public class BankAccount {

    private AccountType accountType;
    private AccountOwnerType accountOwner;
    private String accountNumber;
    private String sortCode;
    private boolean wagesAndBenefitsPaidhere;

    private BigDecimal balance = BigDecimal.ZERO;

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public AccountOwnerType getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(AccountOwnerType accountOwner) {
        this.accountOwner = accountOwner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public boolean isWagesAndBenefitsPaidhere() {
        return wagesAndBenefitsPaidhere;
    }

    public void setWagesAndBenefitsPaidhere(boolean wagesAndBenefitsPaidhere) {
        this.wagesAndBenefitsPaidhere = wagesAndBenefitsPaidhere;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getSortCode() {
        return sortCode;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

}

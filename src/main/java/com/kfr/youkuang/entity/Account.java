package com.kfr.youkuang.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Account {
    private int accountID;

    private String accountName;

    private int userID;

    private BigDecimal sum;

    private BigDecimal budget;

    private Timestamp lastModifiedTime;

    private Timestamp createdTime;

    public Account(int accountID, String accountName, int userID, BigDecimal sum, BigDecimal budget, Timestamp lastModifiedTime, Timestamp createdTime) {
        this.accountID = accountID;
        this.accountName = accountName;
        this.userID = userID;
        this.sum = sum;
        this.budget = budget;
        this.lastModifiedTime = lastModifiedTime;
        this.createdTime = createdTime;
    }

    /*public Account(final int accountID,
                   final String accountName,
                   final int userID,
                   final BigDecimal sum,
                   final Timestamp lastModifiedTime,
                   final Timestamp createdTime) {
        this.accountID = accountID;
        this.accountName = accountName;
        this.userID = userID;
        this.sum = sum;
        this.lastModifiedTime = lastModifiedTime;
        this.createdTime = createdTime;
    }*/

    @Override
    public String toString() {
        return "Account{" +
                "accountName='" + accountName + '\'' +
                ", accountID=" + accountID +
                ", userID=" + userID +
                ", sum=" + sum +
                ", lastModifiedTime=" + lastModifiedTime +
                ", createdTime=" + createdTime +
                '}';
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getAccountID() {
        return accountID;
    }

    public int getUserID() {
        return userID;
    }

    public Timestamp getCreatedTime() {
        return createdTime;
    }

    public Timestamp getLastModifiedTime() {
        return lastModifiedTime;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public BigDecimal getBudget() { return budget; }

    public void setBudget(BigDecimal budget) {
        this.budget = budget;
    }
}

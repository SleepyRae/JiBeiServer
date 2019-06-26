package com.kfr.youkuang.pojo;

import java.math.BigDecimal;

public class ModifyAccountRequest {

    private int accountID;

    private String accountName;

    private int userID;

    private BigDecimal sum;

    private BigDecimal budget;

    public ModifyAccountRequest(int accountID, String accountName, int userID, BigDecimal sum, BigDecimal budget) {
        this.accountID = accountID;
        this.accountName = accountName;
        this.userID = userID;
        this.sum = sum;
        this.budget = budget;
    }

    public String getAccountName() {
        return accountName;
    }

    public int getAccountID() {
        return accountID;
    }

    public int getUserID() {
        return userID;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public BigDecimal getBudget() {
        return budget;
    }
}

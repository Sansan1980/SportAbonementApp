package com.danilov.sport_abonement_app.model;

public class Account {
    private final long accountId;
    private static long accountCounter;

    private double amount;

    public Account() {
        this.amount = 0;
        this.accountId = accountCounter++;
    }

    public long getId() {
        return accountId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

package com.deloitte.lab4ex1;

import java.util.concurrent.atomic.AtomicLong;

public class Account {
    private static final AtomicLong accountNumberGenerator = new AtomicLong(1000);
    private long accNum;
    private double balance;
    private Person accHolder;

    public Account(Person accHolder, double initialBalance) {
        this.accNum = accountNumberGenerator.getAndIncrement();
        this.accHolder = accHolder;
        this.balance = initialBalance;
    }

    public long getAccNum() {
        return accNum;
    }

    public double getBalance() {
        return balance;
    }

    public Person getAccHolder() {
        return accHolder;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Invalid withdrawal amount");
        }
    }
}

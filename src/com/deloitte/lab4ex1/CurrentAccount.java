package com.deloitte.lab4ex1;

public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(Person accHolder, double initialBalance, double overdraftLimit) {
        super(accHolder, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }
    
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() + overdraftLimit) >= amount) {
            super.withdraw(amount);
        }
    }
}

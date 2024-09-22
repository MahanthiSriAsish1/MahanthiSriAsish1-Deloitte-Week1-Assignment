package com.deloitte.lab4ex1;

public class SavingsAccount extends Account {
    private final double minimumBalance = 500.0;

    public SavingsAccount(Person accHolder, double initialBalance) {
        super(accHolder, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() - amount) >= minimumBalance) {
            super.withdraw(amount);
        } else {
            throw new IllegalArgumentException("Withdrawal cannot bring balance below minimum balance of INR " + minimumBalance);
        }
    }
}

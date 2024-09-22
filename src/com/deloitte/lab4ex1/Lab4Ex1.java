package com.deloitte.lab4ex1;

public class Lab4Ex1 {
	public static void main(String[] args) {
        Person smith = new Person("Smith");
        Person kathy = new Person("Kathy");

        SavingsAccount smithAccount = new SavingsAccount(smith, 2000);
        CurrentAccount kathyAccount = new CurrentAccount(kathy, 3000, 1000);

        smithAccount.deposit(2000);
        
        try {
            kathyAccount.withdraw(2000);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Smith's updated balance: " + smithAccount.getBalance());
        System.out.println("Kathy's updated balance: " + kathyAccount.getBalance());
    }

}

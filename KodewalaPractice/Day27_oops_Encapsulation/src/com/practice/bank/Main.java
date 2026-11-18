package com.practice.bank;

public class Main {
    public static void main(String[] args) {
        BankAccount user1 = new BankAccount("Akshat", "23456787654", 100.98);

        user1.displayAccountDetail();
        System.out.println("Balance: " + user1.getBalance());

        // Deposit
        user1.deposit(3400.08);
        System.out.println("Balance: " + user1.getBalance());

        // Withdraw
        user1.withdraw(560.08);
        System.out.println("Balance: " + user1.getBalance());

        // Invalid cases
        user1.deposit(-50);   // Invalid
        user1.withdraw(0);    // Invalid
        user1.withdraw(99999); // Insufficient
    }
}

package com.day17.controlFlow2;

public class Main {

    public static void main(String[] args) {

        // Creating object using constructor
        BankAccount account =
                new BankAccount("Akshat", 1234567890L, 5000);

        // Display initial details
        account.displayAccount();

        // Deposit
        System.out.println("\n--- Deposit ---");
        account.deposit(2000);

        // Valid withdrawal
        System.out.println("\n--- Withdrawal ---");
        account.withdraw(1500);

        // Invalid withdrawal
        System.out.println("\n--- Invalid Withdrawal ---");
        account.withdraw(-500);

        // Insufficient balance
        System.out.println("\n--- Insufficient Balance Test ---");
        account.withdraw(10000);

        // Final details
        account.displayAccount();
    }
}
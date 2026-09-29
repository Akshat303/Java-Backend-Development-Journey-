package com.day17.controlFlow;

public class Main {

    public static void main(String[] args) {

        // Valid input
        BankAccount account =
                new BankAccount("Akshat", 1234567890L, 5000);

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

        // Invalid name
        BankAccount account2 =
                new BankAccount("", 1234567891L, 5000);

        // Invalid account number
        BankAccount account3 =
                new BankAccount("Rahul", -12345L, 5000);

        // Invalid balance
        BankAccount account4 =
                new BankAccount("Amit", 1234567892L, -1000);
    }
}

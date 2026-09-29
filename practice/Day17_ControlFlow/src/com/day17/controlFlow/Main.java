package com.day17.controlFlow;

public class Main {

    public static void main(String[] args) {

        // Valid input
        BankAccount account =
                new BankAccount("Akshat", 1234567890L, 5000);

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

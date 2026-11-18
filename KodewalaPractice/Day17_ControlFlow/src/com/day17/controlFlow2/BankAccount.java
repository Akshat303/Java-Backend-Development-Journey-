package com.day17.controlFlow2;

public class BankAccount {

    // Private variables - data hiding
    private String accountHolder;
    private long accountNumber;
    private double balance;
    private boolean active;

    // Constructor
    public BankAccount(String _accountHolder, long _accountNumber, double _balance) {

        this.accountHolder = _accountHolder;
        this.accountNumber = _accountNumber;
        this.balance = _balance;

        // Control flow
        if (balance >= 500) {
            active = true;
        } else {
            active = false;
        }
    }

    // Deposit method
    public void deposit(double amount) {

        if (!active) {
            System.out.println("Account is inactive");
        }
        else if (amount <= 0) {
            System.out.println("Invalid deposit amount");
        }
        else {
            balance = balance + amount;
            System.out.println("Amount deposited: " + amount);
            System.out.println("New balance: " + balance);
        }
    }

    // Withdraw method
    public void withdraw(double amount) {

        if (!active) {
            System.out.println("Account is inactive");
        }
        else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        }
        else if (amount > balance) {
            System.out.println("Insufficient balance");
        }
        else {
            balance = balance - amount;

            System.out.println("Amount withdrawn: " + amount);
            System.out.println("Remaining balance: " + balance);

            if (balance < 500) {
                System.out.println("Warning: Minimum balance required");
            }
        }
    }

    // Display account details
    public void displayAccount() {

        System.out.println("\n----- Account Details -----");
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : " + balance);

        if (active) {
            System.out.println("Status         : Active");
        } else {
            System.out.println("Status         : Inactive");
        }
    }
}
package com.day27_oopsEncapsulation.task;

public class FundTransfer {

    private String accountHolderName;
    private String accountNumber;
    private double balance;

    public FundTransfer(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void receiveFund(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Enter a valid positive amount.");
        }
    }

    public void sendFund(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance or invalid amount. Current balance: " + balance);
        }
    }

    public double getBalance() {
        return balance;
    }
}

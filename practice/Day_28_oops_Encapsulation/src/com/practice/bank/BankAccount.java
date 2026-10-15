package com.practice.bank;

public class BankAccount {
	private String accountHolderName;
	private String accountNumber;
	private double balance;

	public BankAccount(String accountHolderName, String accountNumber, double balance) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	// Getters
	
	/*
	 * public String getAccountHolderName() { return accountHolderName; }
	 */
	// Getters Balance
	public double getBalance() {
		return balance;
	}

	// Deposit method
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited: " + amount);
		} else {
			System.out.println("Invalid deposit amount");
		}
	}

	// Withdraw method
	public void withdraw(double amount) {
		if (amount > balance && amount <= 0) {
			System.out.println("Invalid withdrawal amount");
		} else {
			balance -= amount;
			System.out.println("Withdrawn: " + amount);
		}
	}

	public void displayAccountDetail() {
		System.out.println("Name - " + accountHolderName);
		System.out.println("Account No. - " + accountNumber);
	}
}

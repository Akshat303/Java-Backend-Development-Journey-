package com.day17.controlFlow;

public class BankAccount {

	private String accountHolder;
	private long accountNumber;
	private double balance;
	private boolean active;

	// Constructor
	public BankAccount(String _accountHolder, long _accountNumber, double _balance) {

		// Validate account holder
		if (_accountHolder == null || _accountHolder.trim().isEmpty()) {
			System.out.println("Invalid account holder name");
			return;
		}

		// Validate account number
		else if (_accountNumber <= 0) {
			System.out.println("Invalid account number");
			return;
		}

		// Validate balance
		else if (_balance < 0) {
			System.out.println("Initial balance cannot be negative");
			return;
		} else {
			// Assign values only after validation
			this.accountHolder = _accountHolder;
			this.accountNumber = _accountNumber;
			this.balance = _balance;

			// Account status
			if (balance >= 500) {
				active = true;
			} else {
				active = false;
			}
		}
	}

	public void deposit(double amount) {

		if (!active) {
			System.out.println("Account is inactive");
		} else if (amount <= 0) {
			System.out.println("Invalid deposit amount");
		} else {
			balance = balance + amount;
			System.out.println("Amount deposited: " + amount);
			System.out.println("New balance: " + balance);
		}
	}

	public void withdraw(double amount) {

		if (!active) {
			System.out.println("Account is inactive");
		} else if (amount <= 0) {
			System.out.println("Invalid withdrawal amount");
		} else if (amount > balance) {
			System.out.println("Insufficient balance");
		} else {
			balance = balance - amount;

			System.out.println("Amount withdrawn: " + amount);
			System.out.println("Remaining balance: " + balance);

			if (balance < 500) {
				System.out.println("Warning: Minimum balance required");
			}
		}
	}

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
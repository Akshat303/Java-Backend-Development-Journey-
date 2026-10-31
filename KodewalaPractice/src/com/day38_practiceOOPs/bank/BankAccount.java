package com.day38_practiceOOPs.bank;

import java.math.BigDecimal;

public class BankAccount {
	private final String accountNumber;
	private final String holderName;
	private BigDecimal balance;

	public BankAccount(String accountNumber, String holderName, BigDecimal initialBalance) {
		
		if (accountNumber == null || accountNumber.isBlank()) {
			throw new IllegalArgumentException("Account number cannot be empty.");
		}
		if (holderName == null || holderName.isBlank()) {
			throw new IllegalArgumentException("Holder name cannot be empty.");
		}
		AccountValidator.validateAmountPositive(initialBalance);

		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = initialBalance;
	}

	// Read-only getters
	public String getAccountNumber() {
		return accountNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	// Controlled state mutation
	public void deposit(BigDecimal amount) {
		AccountValidator.validateAmountPositive(amount);
		this.balance = this.balance.add(amount);
	}

	public void withdraw(BigDecimal amount) {
		AccountValidator.validateAmountPositive(amount);
		AccountValidator.validateSufficientFunds(this.balance, amount);
		this.balance = this.balance.subtract(amount);
	}
}
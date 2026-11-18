package com.day37_interface.bankAccount;

public interface Transactional {
	// Java 7: implicitly public abstract
	void deposit(double amount);

	boolean withdraw(double amount);
}
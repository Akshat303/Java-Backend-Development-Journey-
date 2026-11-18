package com.day34_35_practiceOOPs.bank;

public interface AccountRepository {
	BankAccount findByAccountNumber(String accountNumber);

	void save(BankAccount account);
}
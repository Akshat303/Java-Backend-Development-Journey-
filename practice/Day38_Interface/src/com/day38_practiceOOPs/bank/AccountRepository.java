package com.day38_practiceOOPs.bank;

public interface AccountRepository {
	BankAccount findByAccountNumber(String accountNumber);

	void save(BankAccount account);
}
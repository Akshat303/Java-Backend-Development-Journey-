package com.day38_practiceOOPs.bank;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class InMemoryAccountRepository implements AccountRepository {
	private final Map<String, BankAccount> store = new ConcurrentHashMap<>();

	@Override
	public BankAccount findByAccountNumber(String accountNumber) {
		BankAccount account = store.get(accountNumber);
		if (account == null) {
			throw new IllegalArgumentException("Account not found for ID: " + accountNumber);
		}
		return account;
	}

	@Override
	public void save(BankAccount account) {
		store.put(account.getAccountNumber(), account);
	}
}
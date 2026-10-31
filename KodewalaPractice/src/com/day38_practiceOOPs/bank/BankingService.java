package com.day38_practiceOOPs.bank;

import java.math.BigDecimal;
import java.util.Objects;

public class BankingService {
	private final AccountRepository repository;
	private final NotificationService notificationService;

	// Constructor Injection
	public BankingService(AccountRepository repository, NotificationService notificationService) {
		this.repository = Objects.requireNonNull(repository, "Repository cannot be null");
		this.notificationService = Objects.requireNonNull(notificationService, "NotificationService cannot be null");
	}

	public void deposit(String accountNumber, BigDecimal amount) {
		BankAccount account = repository.findByAccountNumber(accountNumber);
		account.deposit(amount);
		repository.save(account);

		notificationService.sendNotification(account.getHolderName(),
				"Deposit of ₹" + amount + " successful. Updated Balance: ₹" + account.getBalance());
	}

	public void withdraw(String accountNumber, BigDecimal amount) {
		BankAccount account = repository.findByAccountNumber(accountNumber);
		account.withdraw(amount);
		repository.save(account);

		notificationService.sendNotification(account.getHolderName(),
				"Withdrawal of ₹" + amount + " successful. Remaining Balance: ₹" + account.getBalance());
	}
}
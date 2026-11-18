package com.day37_interface.bankAccount;

public class SavingsAccount implements Transactional, Auditable {
	private static final double MINIMUM_BALANCE = 500.0;
	private static final int MAX_HISTORY = 3;

	private String accountNumber;
	private String accountHolder;
	private double balance;

	// Fixed-size array to store the last 3 transaction records
	private String[] statementLog;
	private int logCount;

	public SavingsAccount(String accountNumber, String accountHolder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.statementLog = new String[MAX_HISTORY];
		this.logCount = 0;

		if (initialDeposit >= MINIMUM_BALANCE) {
			this.balance = initialDeposit;
			recordTransaction("ACCOUNT OPENED: +INR " + initialDeposit + " | Bal: INR " + this.balance);
		} else {
			this.balance = MINIMUM_BALANCE;
			recordTransaction("ACCOUNT OPENED (DEF): +INR " + MINIMUM_BALANCE + " | Bal: INR " + this.balance);
			System.out.println("Warning: Initial deposit below min balance (INR 500). Set to INR 500.0 by default.");
		}
	}

	// Helper method to maintain rolling history of last 3 transactions
	private void recordTransaction(String entry) {
		if (logCount < MAX_HISTORY) {
			statementLog[logCount] = entry;
			logCount++;
		} else {
			// Shift older elements left to make room for newest
			statementLog[0] = statementLog[1];
			statementLog[1] = statementLog[2];
			statementLog[2] = entry;
		}
	}

	@Override
	public void deposit(double amount) {
		if (amount <= 0) {
			System.out.println("Deposit Failed: Amount must be greater than 0.");
			recordTransaction("FAILED DEPOSIT: Invalid amount INR " + amount);
			return;
		}

		balance += amount;
		System.out.println("Deposit Success: INR " + amount + " credited.");
		recordTransaction("DEPOSIT: +INR " + amount + " | Bal: INR " + balance);
	}

	@Override
	public boolean withdraw(double amount) {
		if (amount <= 0) {
			System.out.println("Withdrawal Failed: Amount must be greater than 0.");
			recordTransaction("FAILED WITHDRAWAL: Invalid amount INR " + amount);
			return false;
		}

		// Check if balance after withdrawal breaches minimum balance requirement
		if ((balance - amount) < MINIMUM_BALANCE) {
			System.out.println("Withdrawal Rejected: Minimum balance rule breached! You must keep at least INR "
					+ MINIMUM_BALANCE);
			recordTransaction("REJECTED WITHDRAWAL: -INR " + amount + " (Min Bal Limit)");
			return false;
		}

		balance -= amount;
		System.out.println("Withdrawal Success: INR " + amount + " debited.");
		recordTransaction("WITHDRAWAL: -INR " + amount + " | Bal: INR " + balance);
		return true;
	}

	@Override
	public void generateMiniStatement() {
		System.out.println("\n========== MINI STATEMENT ==========");
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Account Holder : " + accountHolder);
		System.out.println("Current Balance: INR " + balance);
		System.out.println("Recent Activity (Last " + MAX_HISTORY + " Records):");

		for (int i = 0; i < logCount; i++) {
			System.out.println(" [" + (i + 1) + "] " + statementLog[i]);
		}
		System.out.println("=====================================\n");
	}

	public double getBalance() {
		return balance;
	}
}

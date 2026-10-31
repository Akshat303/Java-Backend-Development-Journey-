package com.day38_practiceOOPs.bank;

import java.math.BigDecimal;

public final class AccountValidator {

	private AccountValidator() {
		// Utility class - instantiation strictly blocked
	}

	public static void validateAmountPositive(BigDecimal amount) {
		if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
			throw new IllegalArgumentException("Amount must be greater than zero.");
		}
	}

	public static void validateSufficientFunds(BigDecimal currentBalance, BigDecimal amount) {
		if (currentBalance.compareTo(amount) < 0) {
			throw new IllegalStateException("Insufficient funds for this withdrawal.");
		}
	}
}
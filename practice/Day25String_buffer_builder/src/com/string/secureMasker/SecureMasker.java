package com.string.secureMasker;

public class SecureMasker {

	/**
	 * Masks sensitive identifiers such as account numbers or phone numbers. Keeps
	 * the last 4 characters visible, replaces the rest with '*'.
	 *
	 * @param input The sensitive string (account number, phone, etc.)
	 * @return Masked string
	 */
	public String maskSensitiveData(String input) {
		if (input == null || input.isEmpty()) {
			return "";
		}

		int length = input.length();

		// If length <= 4, return unchanged
		if (length <= 4) {
			return input;
		}

		StringBuffer buffer = new StringBuffer(input);

		// Replace all but last 4 characters with '*'
		for (int i = 0; i < length - 4; i++) {
			buffer.replace(i, i + 1, "*");
		}

		return buffer.toString();
	}
}

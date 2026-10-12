package com.string.practice;

public class RegistrationService {

	// 1. Validation
	public boolean validateUsername(String username) {
		return username != null && !username.trim().isEmpty();
	}

	// 2. Normalization
	public String normalizeDisplayName(String displayName) {
		if (displayName == null)
			return "";
		displayName = displayName.trim();
		if (displayName.isEmpty())
			return "";

		// Capitalize first letter of each word
		String[] parts = displayName.split("\\s+");
		StringBuilder normalized = new StringBuilder();
		for (String part : parts) {
			if (part.length() > 0) {
				normalized.append(Character.toUpperCase(part.charAt(0))).append(part.substring(1).toLowerCase())
						.append(" ");
			}
		}
		return normalized.toString().trim();
	}

	// 3. Registration message using StringBuilder
	public String buildRegistrationMessage(String username, String displayName) {
		StringBuilder builder = new StringBuilder();
		builder.append("Registration successful\n").append("Username: ").append(username).append("\n")
				.append("Display Name: ").append(displayName);
		return builder.toString();
	}

	// 4. Audit message using StringBuffer
	public String buildAuditMessage(String username) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Audit: User registered: ").append(username);
		return buffer.toString();
	}

	// 5. Investigate intern()
	public void investigateIntern(String username) {
		String u1 = username;
		String u2 = new String(username);
		String u3 = u2.intern();

		System.out.println("u1 == u2: " + (u1 == u2)); // false
		System.out.println("u1 == u3: " + (u1 == u3)); // true
		System.out.println("u1.equals(u2): " + u1.equals(u2)); // true
		System.out.println("u2.equals(u3): " + u2.equals(u3)); // true
	}
}

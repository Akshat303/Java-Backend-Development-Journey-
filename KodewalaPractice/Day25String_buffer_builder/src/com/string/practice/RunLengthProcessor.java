package com.string.practice;

public class RunLengthProcessor {

	/**
	 * Compresses consecutive repeated characters using run-length encoding.
	 * Example: "aaabbccccdaa" -> "a3b2c4d1a2"
	 *
	 * @param input The original string
	 * @return Compressed string
	 */
	public String compress(String input) {
		if (input == null || input.isEmpty()) {
			return "";
		}

		StringBuilder result = new StringBuilder();
		int count = 1;

		for (int i = 1; i <= input.length(); i++) {
			if (i < input.length() && input.charAt(i) == input.charAt(i - 1)) {
				count++;
			} else {
				result.append(input.charAt(i - 1)).append(count);
				count = 1;
			}
		}

		return result.toString();
	}

	/**
	 * Decompresses a run-length encoded string back to original. Example:
	 * "a3b2c4d1a2" -> "aaabbccccdaa"
	 *
	 * Encoding rule: Each character is followed by its count. If input contains
	 * digits originally, they must be escaped or handled separately.
	 *
	 * @param encoded The compressed string
	 * @return Original string
	 */
	public String decompress(String encoded) {
		if (encoded == null || encoded.isEmpty()) {
			return "";
		}

		StringBuilder result = new StringBuilder();
		for (int i = 0; i < encoded.length(); i++) {
			char ch = encoded.charAt(i);
			StringBuilder num = new StringBuilder();

			// Collect digits after character
			while (i + 1 < encoded.length() && Character.isDigit(encoded.charAt(i + 1))) {
				num.append(encoded.charAt(++i));
			}

			int count = Integer.parseInt(num.toString());
			for (int j = 0; j < count; j++) {
				result.append(ch);
			}
		}
		return result.toString();
	}
}

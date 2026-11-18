package com.string.sentenceProcessor;

import java.util.Scanner;

public class SentenceProcessor {

	public void processSentence() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String input = scanner.nextLine();

		// Handle empty or whitespace-only input
		if (input == null || input.trim().isEmpty()) {
			System.out.println("Empty or whitespace-only input.");
			return;
		}

		// Split by spaces, handle multiple spaces
		String[] words = input.trim().split("\\s+");
		StringBuilder result = new StringBuilder();

		// Reverse order of words manually
		for (int i = words.length - 1; i >= 0; i--) {
			result.append(words[i]);
			if (i > 0) {
				result.append(" ");
			}
		}

		System.out.println("Reversed sentence: " + result.toString());
	}

	// Bonus: Reverse using character array without split()
	public void processSentenceUsingCharArray(String input) {
		if (input == null || input.trim().isEmpty()) {
			System.out.println("Empty or whitespace-only input.");
			return;
		}

		char[] chars = input.trim().toCharArray();
		StringBuilder word = new StringBuilder();
		StringBuilder result = new StringBuilder();

		// Traverse backwards to collect words
		for (int i = chars.length - 1; i >= 0; i--) {
			if (chars[i] != ' ') {
				word.insert(0, chars[i]); // build word from back
			} else {
				if (word.length() > 0) {
					if (result.length() > 0)
						result.append(" ");
					result.append(word);
					word.setLength(0);
				}
			}
		}
		// Append last word
		if (word.length() > 0) {
			if (result.length() > 0)
				result.append(" ");
			result.append(word);
		}

		System.out.println("Reversed sentence (char array method): " + result.toString());
	}
}

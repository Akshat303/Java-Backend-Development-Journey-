package com.string.sentenceProcessor;

public class Main {
	public static void main(String[] args) {
		SentenceProcessor processor = new SentenceProcessor();

		// Standard method using split()
		processor.processSentence();

		// Bonus method demonstration
		String testInput = "Java   is powerful";
		processor.processSentenceUsingCharArray(testInput);
	}
}

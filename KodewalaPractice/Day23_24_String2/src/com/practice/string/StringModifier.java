package com.practice.string;

public class StringModifier {

	private String original;

	public StringModifier(String original) {
		this.original = original;
	}

	public void performOperations() {

		// Original String
		System.out.println("Original String: " + original);
		System.out.println();

		// 1. concat()
		String concatResult = original.concat(" Srivastava");

		System.out.println("After concat(): " + concatResult);
		System.out.println("Original String: " + original);
		System.out.println("Original changed? " + !original.equals(concatResult));
		System.out.println();

		// 2. toUpperCase()
		String upperResult = original.toUpperCase();

		System.out.println("After toUpperCase(): " + upperResult);
		System.out.println("Original String: " + original);
		System.out.println("Original changed? " + !original.equals(upperResult));
		System.out.println();

		// 3. toLowerCase()
		String lowerResult = original.toLowerCase();

		System.out.println("After toLowerCase(): " + lowerResult);
		System.out.println("Original String: " + original);
		System.out.println("Original changed? " + !original.equals(lowerResult));
		System.out.println();

		// 4. replace()
		String replaceResult = original.replace('A', 'X');

		System.out.println("After replace(): " + replaceResult);
		System.out.println("Original String: " + original);
		System.out.println("Original changed? " + !original.equals(replaceResult));
	}
}
package com.practice.string;

public class StringImmutability {

	// This method demonstrates String immutability
	public void demonstrateImmutability() {

		// Original String object
		String original = "Hello";

		// concat() does NOT modify the original String.
		// It creates a new String object and returns its reference.
		String result = original.concat(" Java");

		// Original String remains unchanged
		System.out.println("Original String: " + original);

		// Result contains the newly created String
		System.out.println("Result String: " + result);
	}
}

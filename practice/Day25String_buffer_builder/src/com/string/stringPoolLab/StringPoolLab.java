package com.string.stringPoolLab;

public class StringPoolLab {

	public void runInvestigation() {
		String a = "Java";
		String b = new String("Java");
		String c = b.intern();
		String d = "Java";

		// Predictions
		System.out.println("a == b: " + (a == b)); // false (different objects: pool vs heap)
		System.out.println("a == c: " + (a == c)); // true (c points to pool reference)
		System.out.println("c == d: " + (c == d)); // true (both point to pool reference)

		// Content comparison
		System.out.println("a.equals(b): " + a.equals(b)); // true (same content)
		System.out.println("b.equals(c): " + b.equals(c)); // true (same content)

		// Identity hash codes
		System.out.println("Identity Hash Codes:");
		System.out.println("a: " + System.identityHashCode(a));
		System.out.println("b: " + System.identityHashCode(b));
		System.out.println("c: " + System.identityHashCode(c));
		System.out.println("d: " + System.identityHashCode(d));
		System.out.println("--------------------------------------------------");

		// Explanation
		System.out.println("intern() returns a reference to the string from the pool.");
		System.out.println("It does not modify the original String object; it simply ensures");
		System.out.println("that the returned reference points to the canonical pooled instance.");
	}
}

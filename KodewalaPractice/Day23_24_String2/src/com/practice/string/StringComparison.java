package com.practice.string;

public class StringComparison {

	private String s1;
	private String s2;
	private String s3;
	private String s4;

	public StringComparison(String s1, String s2, String s3, String s4) {
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.s4 = s4;
	}

	// == checks whether two references point to the same object
	public void compareUsingReference() {

		System.out.println("===== Reference Comparison (==) =====");

		System.out.println("s1 == s2 : " + (s1 == s2));
		System.out.println("s1 == s3 : " + (s1 == s3));
		System.out.println("s1 == s4 : " + (s1 == s4));

		System.out.println("s2 == s3 : " + (s2 == s3));
		System.out.println("s2 == s4 : " + (s2 == s4));

		System.out.println("s3 == s4 : " + (s3 == s4));
	}

	// equals() checks whether two String objects have the same content
	public void compareUsingContent() {

		System.out.println("\n===== Content Comparison (.equals()) =====");

		System.out.println("s1.equals(s2) : " + s1.equals(s2));
		System.out.println("s1.equals(s3) : " + s1.equals(s3));
		System.out.println("s1.equals(s4) : " + s1.equals(s4));

		System.out.println("s2.equals(s3) : " + s2.equals(s3));
		System.out.println("s2.equals(s4) : " + s2.equals(s4));

		System.out.println("s3.equals(s4) : " + s3.equals(s4));
	}
}
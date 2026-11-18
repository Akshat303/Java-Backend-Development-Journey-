package com.practice.string;

public class DriverStringComparison {

	public static void main(String[] args) {

		String s1 = "Kodewala";
		String s2 = "Kodewala";
		String s3 = new String("Kodewala");
		String s4 = new String("Kodewala");

		StringComparison comparison = new StringComparison(s1, s2, s3, s4);

		comparison.compareUsingReference();

		comparison.compareUsingContent();
	}
}
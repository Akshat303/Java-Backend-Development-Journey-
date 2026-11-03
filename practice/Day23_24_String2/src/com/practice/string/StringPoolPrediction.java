package com.practice.string;

public class StringPoolPrediction {

	public static void main(String[] args) {
		String a = "Java";
		String b = "Java";
		String c = new String("Java");
		String d = new String("Java");

		System.out.println(a == b); // True
		System.out.println(a == c); // False
		System.out.println(c == d); // False

		System.out.println(a.equals(c)); // True
		System.out.println(c.equals(d)); // True

	}

}

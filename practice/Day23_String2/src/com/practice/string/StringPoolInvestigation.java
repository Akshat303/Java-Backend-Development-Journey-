package com.practice.string;

public class StringPoolInvestigation {

	public void investigate() {

		String s1 = "Java";
		String s2 = "Ja" + "va";
		String s3 = new String("Java");
		String s4 = s3.intern();
		String s5 = "Ja";
		String s6 = s5 + "va";

		System.out.println("===== == Comparisons =====");

		System.out.println("s1 == s2 : " + (s1 == s2));
		System.out.println("s1 == s3 : " + (s1 == s3));
		System.out.println("s1 == s4 : " + (s1 == s4));
		System.out.println("s1 == s6 : " + (s1 == s6));

		System.out.println("s2 == s4 : " + (s2 == s4));
		System.out.println("s2 == s6 : " + (s2 == s6));

		System.out.println("s3 == s4 : " + (s3 == s4));

		System.out.println();

		System.out.println("===== equals() Comparisons =====");

		System.out.println("s1.equals(s2) : " + s1.equals(s2));
		System.out.println("s1.equals(s3) : " + s1.equals(s3));
		System.out.println("s1.equals(s4) : " + s1.equals(s4));
		System.out.println("s1.equals(s6) : " + s1.equals(s6));

		System.out.println("s2.equals(s4) : " + s2.equals(s4));
		System.out.println("s2.equals(s6) : " + s2.equals(s6));
		System.out.println("s3.equals(s4) : " + s3.equals(s4));

		System.out.println();

		System.out.println("===== identityHashCode() =====");

		System.out.println("s1 : " + System.identityHashCode(s1));
		System.out.println("s2 : " + System.identityHashCode(s2));
		System.out.println("s3 : " + System.identityHashCode(s3));
		System.out.println("s4 : " + System.identityHashCode(s4));
		System.out.println("s5 : " + System.identityHashCode(s5));
		System.out.println("s6 : " + System.identityHashCode(s6));
	}
}
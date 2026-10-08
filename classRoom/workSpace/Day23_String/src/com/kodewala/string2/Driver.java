package com.kodewala.string2;

public class Driver {

	public static void main(String[] args) {
		
		String s1 = "Kodewala";
		String s2 = new String("Kodewala");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		String s3 = new String ("A");
		String s4 = new String ("A");
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		
		String s5 = "B";
		String s6 = "b";
		System.out.println(s5 == s6);
		System.out.println(s5.equals(s6));

	}

}

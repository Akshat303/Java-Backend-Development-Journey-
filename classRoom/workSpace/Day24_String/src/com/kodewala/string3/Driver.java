package com.kodewala.string3;

public class Driver {
	public static void main(String[] args) {
		String s1 = "This " + "id from  " + "Kodewala Academy Bangalore";

		System.out.println(s1);

		String s2 = "Kodewala "; // scp
		String s3 = "academy";   // scp
		String s4 = s2 + s3;    // heap --> new StringBuulder()
		System.out.println(s4); 
		String s5 = "Kodewala academy";
		
		System.out.println(s5 == s4.intern());

	}

}

package com.kodewala.pdfPractice;

public class LearnString {

	public static void main(String[] args) {

		/*
		 * String a = new String("Java"); String b = new String("Java");
		 * 
		 * System.out.println(a == b); // False : alag objects.
		 * System.out.println(a.equals(b)); // True : content same hai, "Java".
		 */
//		-------------------------------------------------------

		/*
		 * String s1 = "Kodewala";
		 * 
		 * s1.concat(" Academy");
		 * 
		 * System.out.println(s1); // Kodewala String s2 = s1.concat(" Academy");
		 * System.out.println(s2); // Kodewala Academy
		 */
//		---------------------------------------------------
        String s1 = "Kodewala Academy"; // scp

        String s2 = new String("Kodewala Academy"); // heap

        String s3 = s2.intern(); //s2 k value ka refrence s3 scp mai

        System.out.println(s1 == s2); // False
        System.out.println(s1 == s3); // True
        System.out.println(s2 == s3); // False
	}
}
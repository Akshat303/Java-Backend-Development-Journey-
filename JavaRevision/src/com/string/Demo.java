package com.string;

public class Demo {

	public static void main(String[] args) {

		String s1 = "Hello"; // Literal (String pool)
		String s2 = "Hello";

		System.out.println(s1 == s2); // true, because reference is same

		String s3 = new String("Hello"); // using new operator (Heap memory)
		String s4 = new String("Hello");
		System.out.println(s3 == s4); // false, because reference is difference

		String s5 = "ja" + "va"; // store in string pool because add in compiler time
		String s6 = "java";
		System.out.println(s5 == s6); // True

		String s7 = "ja" + "va";
		String s8 = s7 + "va";
		System.out.println(s7 == s8); // False

		String s9 = "java";
		System.out.println(s8 == s9); // False

		String var1 = "Akshat";
		String var2 = var1;
		System.out.println(var1 == var2); // True

		String newVar = new String("name");
		String litVar = "name";
		System.out.println(litVar == newVar); //False

		/**
		 * String pool --> "Any" , "Name" , "Any Name" 
		 * Heap --> "Any Name"
		 */
		String varName = "Any";
		String varAny = varName + " Name";
		String varFull = "Any Name";
		System.out.println(varAny == varFull); //False
		
		String tryVar = "old";
		 tryVar = "new";
		System.out.println(tryVar); //new

	}

}

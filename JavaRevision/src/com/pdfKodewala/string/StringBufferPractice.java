package com.pdfKodewala.string;

public class StringBufferPractice {

	public static void main(String[] args) {

		// Normal string

		String name = "Akshat"; // scp

		// name variable value is not update // Concatenation with + at runtime → create
		// new object in heap.

		name = name + " Srivastava"; // heap (AkshatSrivastava), scp Srivastava
		String name2 = "Akshat Srivastava"; // scp {Total 4 object}

		System.out.println(name); // Akshat srivastava
		System.out.println(name == name2); // false
		System.out.println(name.equals(name2)); // true
		

		// Using Java's built-in StringBuffer
		
//		StringBuffer name = ...	StringBuffer object banaya aur initial text diya.
//		name.append(...)	Existing buffer ke end mein text add kiya.
		
		StringBuffer str = new StringBuffer("Akshat"); // scp & Heap 
		str.append(" Srivastava"); // scp--> Srivastava  // name = update Akshat Srivastava in heap total 4 object
		
		String str2 = "Akshat Srivastava";

		System.out.println(str); // Output: Akshat Srivastava
		System.out.println(str.equals(str2)); // false
		System.out.println(str.toString().equals(str2)); // true

	}

}

package com.kodewala.string2;

public class Driver2 {

	public static void main(String[] args) {

		String var = "Akshat";
		var.concat("Srivastava");		
		System.out.println(var);
		
		
		String name = "Kodewala";
		String fullName = name.concat(" Academy");
		String fullName2 = name + (" Name");
		
		System.out.println(fullName);
		System.out.println(fullName2);
		System.out.println(System.identityHashCode(fullName));

	}

}

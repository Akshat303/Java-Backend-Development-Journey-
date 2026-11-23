package com.exceptionHandling3;

public class Driver {
	public static void main(String[] args) {
		String name = null;
		System.out.println(name.length()); // NullPointerException

		String className = "com.kodewala.exception4.Driver";

//		Class.forName(className); // loading the class into memory

		System.out.println(" class loaded...");

	}
}
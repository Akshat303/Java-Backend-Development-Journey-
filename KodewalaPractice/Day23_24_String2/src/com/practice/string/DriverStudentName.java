package com.practice.string;

public class DriverStudentName {

	public static void main(String[] args) {

		StudentName student = new StudentName("Akshat", "Kumar", "Srivastava");

		String fullNameConcat = student.createFullNameUsingConcat();
		String fullNamePlus = student.createFullNameUsingPlus();

		System.out.println("Full Name using concat(): " + fullNameConcat);
		System.out.println("Full Name using +       : " + fullNamePlus);

		System.out.println();

		student.displayIdentityHashCodes();
	}
}

package com.practice.objectBlock;

public class Student {

	// Static variable shared across all students
	private static int totalStudents = 0;

	// Instance variables unique to each student
	private String studentName;
	private int rollNumber;

	// Static block
	static {
		System.out.println("Student class initialized");
	}

	// Instance initialization block
	{
		System.out.println("Student object initialization started");
	}

	// Constructor
	public Student(String studentName, int rollNumber) {
		this.studentName = studentName;
		this.rollNumber = rollNumber;

	}

	{
		totalStudents++; // increment count when new student is created
	}

	// Instance method
	public void displayStudent() {
		System.out.println("Name: " + studentName + ", Roll No: " + rollNumber);
	}

	// Static method
	public static void displayTotalStudents() {
		System.out.println("Total Students Registered: " + totalStudents);
	}
}

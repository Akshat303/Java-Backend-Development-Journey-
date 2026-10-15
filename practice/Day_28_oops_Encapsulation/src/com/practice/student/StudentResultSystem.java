package com.practice.student;

public class StudentResultSystem {

	private String name;
	private int rollNumber;
	private int marks; // default 0

	// Constructor
	public StudentResultSystem(String name, int rollNumber) {
	        this.name = name;
	        this.rollNumber = rollNumber;
	    }

	// Setter with validation
	public void setMarks(int marks) {
		if (marks >= 0 && marks <= 100) {
			this.marks = marks;
		} else {
			System.out.println("Invalid marks! Must be between 0 and 100.");
		}
	}

	// Getter
	
	/*
	 * public int getMarks() { return marks; }
	 */

	// Grade calculation
	public String getGrade() {
		if (marks >= 90)
			return "A";
		else if (marks >= 75)
			return "B";
		else if (marks >= 60)
			return "C";
		else if (marks >= 40)
			return "D";
		else
			return "Fail";
	}

	// Display details
	public void displayStudent() {
		System.out
				.println("Name: " + name + ", Roll No: " + rollNumber + ", Marks: " + marks + ", Grade: " + getGrade());
	}
}

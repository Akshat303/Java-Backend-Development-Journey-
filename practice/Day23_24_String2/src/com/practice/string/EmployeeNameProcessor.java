package com.practice.string;

public class EmployeeNameProcessor {

	private String firstName;
	private String lastName;

	public EmployeeNameProcessor(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// Creates full name
	public String createFullName() {
		return firstName + " " + lastName;
	}

	// Converts full name to uppercase
	public String convertToUpperCase(String fullName) {
		return fullName.toUpperCase();
	}

	// Converts full name to lowercase
	public String convertToLowerCase(String fullName) {
		return fullName.toLowerCase();
	}

	// Replaces first name with "Java"
	public String replaceName(String fullName) {
		return fullName.replace("Akshat", "Java");
	}
}
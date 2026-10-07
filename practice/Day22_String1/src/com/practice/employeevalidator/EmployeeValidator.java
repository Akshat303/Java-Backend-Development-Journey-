package com.practice.employeevalidator;

import java.util.Arrays;

public class EmployeeValidator {

	private String employeeName;
	private String department;
	private String[] allowedDepartments;

	private static int totalValidated;

	// Constructor
	public EmployeeValidator(String _employeeName, String _department) {

		this.employeeName = _employeeName;
		this.department = _department;

		allowedDepartments = new String[] { "IT", "HR", "Finance", "Marketing" };

		// Sort array before using binarySearch()
		Arrays.sort(allowedDepartments);
	}

	// Validate employee name
	public boolean validateName() {

		if (employeeName == null || employeeName.isEmpty()) {
			return false;
		}

		if (employeeName.length() < 3) {
			return false;
		}

		return true;
	}

	// Validate department
	public boolean validateDepartment() {

		int result = Arrays.binarySearch(allowedDepartments, department);

		if (result >= 0) {
			return true;
		}

		return false;
	}

	// Display validation result
	public void displayResult() {

		boolean nameValid = validateName();
		boolean departmentValid = validateDepartment();

		// Every time employee is validated
		totalValidated++;

		System.out.println();
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Department: " + department);

		if (nameValid && departmentValid) {

			System.out.println("Status: Valid");

			switch (department) {

			case "IT":
				System.out.println("Department Message: Technology Team");
				break;

			case "HR":
				System.out.println("Department Message: Human Resources Team");
				break;

			case "Finance":
				System.out.println("Department Message: Finance Team");
				break;

			case "Marketing":
				System.out.println("Department Message: Marketing Team");
				break;

			default:
				System.out.println("Department Message: Unknown Department");
			}

		} else {

			System.out.println("Status: Invalid");

			if (!nameValid) {
				System.out.println("Invalid Employee Name");
			}

			if (!departmentValid) {
				System.out.println("Invalid Department");
			}
		}

		System.out.println();
		System.out.println("Total Employees Validated: " + totalValidated);
	}
}
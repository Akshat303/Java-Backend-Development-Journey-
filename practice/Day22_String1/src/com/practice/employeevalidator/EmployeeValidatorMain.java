package com.practice.employeevalidator;

import java.util.Scanner;

public class EmployeeValidatorMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter employee name: ");
		String employeeName = scanner.nextLine();

		System.out.print("Enter department: ");
		String department = scanner.nextLine();

		EmployeeValidator employee = new EmployeeValidator(employeeName, department);

		employee.displayResult();

		scanner.close();
	}
}
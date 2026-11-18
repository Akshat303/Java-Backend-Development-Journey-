package com.practice.employeeSalary;

import java.util.Scanner;

public class DriverEmployeeSalary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Employee Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Salary: ");
		double salary = sc.nextDouble();

		sc.nextLine();

		System.out.print("Enter Designation: ");
		String designation = sc.nextLine();

		EmployeeSalary employee = new EmployeeSalary(name, salary, designation);

		double FinalSalary = employee.calculateSalary();

		System.out.println("Final Salary: ₹" + FinalSalary);
	}
}
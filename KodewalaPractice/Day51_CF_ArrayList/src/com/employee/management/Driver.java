package com.employee.management;

public class Driver
{

	public static void main(String[] args)
	{

		EmployeeService service = new EmployeeServiceImpl();

		// Add Employees

		service.addEmployee(new Employee(101, "Akshat"));

		service.addEmployee(new Employee(102, "Rahul"));

		service.addEmployee(new Employee(103, "Neha"));

		service.addEmployee(new Employee(104, "Aman"));

		service.addEmployee(new Employee(105, "Priya"));

		service.displayEmployees();

		// Insert at Index 2

		service.addEmployeeAtIndex(2, new Employee(106, "Sonu"));

		System.out.println("\nAfter Insertion");

		service.displayEmployees();

		// Remove

		service.removeEmployee(3);

		// Update

		service.updateEmployeeName(101, "Akshat Sharma");

		// Search

		service.searchEmployee(104);

		// First Employee

		service.displayFirstEmployee();

		// Last Employee

		service.displayLastEmployee();

		// Total Employees

		service.totalEmployees();

		// Backup

		service.createBackup();

		// Retain

		service.keepCommonEmployees();

		// Clear

		service.clearBackup();
	}
}
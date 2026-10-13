package com.practice.objectBlock;

public class EmployeeDriver {

	public static void main(String[] args) {

		// Create employees in different order
		Employee e1 = new Employee("Akshat");
		Employee e2 = new Employee("Rahul");
		Employee e3 = new Employee("Aman");
		Employee e4 = new Employee("Ravi");

		// Display details
		e1.displayEmployee();
		e2.displayEmployee();
		e3.displayEmployee();
		e4.displayEmployee();

		// Show total employees
		Employee.displayTotalEmployees();
	}
}

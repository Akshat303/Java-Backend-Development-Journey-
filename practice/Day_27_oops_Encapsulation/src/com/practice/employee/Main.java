package com.practice.employee;

public class Main {
	public static void main(String[] args) {
		Employee emp = new Employee(101, "Akshat", 40000);
		emp.setBonus(5000);

		System.out.println("Employee ID: " + emp.getEmployeeId());
		System.out.println("Name: " + emp.getName());
		System.out.println("Basic Salary: ₹" + emp.getBasicSalary());
		System.out.println("Bonus: ₹" + emp.getBonus());
		System.out.println("Total Salary: ₹" + emp.calculateTotalSalary());
	}
}

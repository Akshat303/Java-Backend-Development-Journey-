package com.string.finalPractice;

//Parent class
public class Employee {

	// Base salary method (can be overridden)
	public double calculateBaseSalary() {
		return 30000.0;
	}

	// Final method: cannot be overridden
	public final double calculateTax() {
		return calculateBaseSalary() * 0.10;
	}

	// Display salary details (can be overridden)
	public void displaySalary() {
		double base = calculateBaseSalary();
		double tax = calculateTax();
		double net = base - tax;

		System.out.println("Base Salary: ₹" + base);
		System.out.println("Tax: ₹" + tax);
		System.out.println("Net Salary: ₹" + net);
	}
}

//Child class: Developer
class Developer extends Employee {

	@Override
	public double calculateBaseSalary() {
		return 50000.0; // Developer salary
	}

	// ❌ Attempting to override calculateTax() will cause a compiler error
	// @Override
	// public double calculateTax() { return 0; } // Not allowed

	@Override
	public void displaySalary() {
		System.out.println("Developer Salary Details:");
		super.displaySalary(); // reuse parent logic
	}
}

//Child class: Manager
class Manager extends Employee {

	@Override
	public double calculateBaseSalary() {
		return 70000.0; // Manager salary
	}

	// Inherits final calculateTax() without overriding
}

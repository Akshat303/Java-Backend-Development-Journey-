package com.practice.employee;

public class Employee {

	private final int employeeId; // immutable after construction
	private String name;
	private double basicSalary;
	private double bonus;

	// Constructor
	public Employee(int employeeId, String name, double basicSalary) {
		if (basicSalary <= 0) {
			
			/*
			 * throw
			 * 
			 * This keyword tells Java to stop normal execution and signal that an error
			 * (exception) has occurred.
			 * 
			 * It literally “throws” an exception object into the runtime system.
			 * 
			 * new
			 * 
			 * This keyword creates a new object instance.
			 * 
			 * Here, we are creating a new exception object.
			 * 
			 * IllegalArgumentException
			 * 
			 * This is the type of exception being created.
			 * 
			 * It’s a built-in Java class that indicates a method has received an illegal or
			 * inappropriate argument.
			 * 
			 * In this case, the illegal argument is a salary that is not positive.
			 */
			
			throw new IllegalArgumentException("Basic salary must be positive.");
		}
		this.employeeId = employeeId;
		this.name = name;
		this.basicSalary = basicSalary;
		this.bonus = 0; // default
	}

	// Controlled bonus setter
	public void setBonus(double bonus) {
		if (bonus < 0) {
			throw new IllegalArgumentException("Bonus cannot be negative.");
		}
		this.bonus = bonus;
	}

	// Calculate total salary
	public double calculateTotalSalary() {
		return basicSalary + bonus;
	}

	// Getters
	public int getEmployeeId() {
		return employeeId;
	}

	public String getName() {
		return name;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public double getBonus() {
		return bonus;
	}
}

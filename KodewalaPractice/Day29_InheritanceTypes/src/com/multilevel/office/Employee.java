package com.multilevel.office;

public class Employee extends Person {

	private final int employeeId;
	private final double salary;

	public Employee(String name, int age, int employeeId, double salary) {

		super(name, age);

		validateEmployeeId(employeeId);
		validateSalary(salary);

		this.employeeId = employeeId;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public double getSalary() {
		return salary;
	}

	private static void validateEmployeeId(int employeeId) {
		if (employeeId <= 0) {
			throw new IllegalArgumentException("Employee ID must be positive");
		}
	}

	private static void validateSalary(double salary) {
		if (salary < 0) {
			throw new IllegalArgumentException("Salary cannot be negative");
		}
	}
}
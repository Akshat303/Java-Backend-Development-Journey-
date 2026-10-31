package com.day38_practiceOOPs.company;

import java.math.BigDecimal;

public abstract class Employee {
	private final String id;
	private final String name;
	private final BigDecimal baseSalary;

	protected Employee(String id, String name, BigDecimal baseSalary) {
		if (id == null || id.isBlank()) {
			throw new IllegalArgumentException("Employee ID cannot be empty.");
		}
		if (name == null || name.isBlank()) {
			throw new IllegalArgumentException("Employee Name cannot be empty.");
		}
		if (baseSalary == null || baseSalary.compareTo(BigDecimal.ZERO) < 0) {
			throw new IllegalArgumentException("Base salary must be non-negative.");
		}

		this.id = id;
		this.name = name;
		this.baseSalary = baseSalary;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public BigDecimal getBaseSalary() {
		return baseSalary;
	}

	// Role-specific designation for polymorphism
	public abstract String getRole();
}
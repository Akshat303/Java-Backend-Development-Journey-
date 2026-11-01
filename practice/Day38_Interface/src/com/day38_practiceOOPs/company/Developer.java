package com.day38_practiceOOPs.company;

import java.math.BigDecimal;

public class Developer extends Employee {
	private final String programmingLanguage;

	public Developer(String id, String name, BigDecimal baseSalary, String programmingLanguage) {
		super(id, name, baseSalary);
		if (programmingLanguage == null || programmingLanguage.isBlank()) {
			throw new IllegalArgumentException("Programming language cannot be empty.");
		}
		this.programmingLanguage = programmingLanguage;
	}

	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

	@Override
	public String getRole() {
		return "Software Developer";
	}
}
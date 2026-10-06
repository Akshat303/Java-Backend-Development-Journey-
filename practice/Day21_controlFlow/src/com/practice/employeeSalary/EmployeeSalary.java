package com.practice.employeeSalary;

public class EmployeeSalary {

	private String name;
	private double basicSalary;
	private String employeeType;

	public EmployeeSalary(String _name, double _basicSalary, String _employeeType) {
		this.name = _name;
		this.basicSalary = _basicSalary;
		this.employeeType = _employeeType;
	}

	public double calculateSalary() {
		if (basicSalary <= 0) {
			return 0;
		}
		double bonusPercent = 0;
		if (employeeType.equalsIgnoreCase("Manager")) {
			bonusPercent = 20;
		} else if (employeeType.equalsIgnoreCase("Developer")) {
			bonusPercent = 15;
		} else if (employeeType.equalsIgnoreCase("Intern")) {
			bonusPercent = 5;
		}

		double bonus = basicSalary * bonusPercent / 100;

		return basicSalary + bonus;
	}

}

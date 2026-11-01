package com.day38_practiceOOPs.company;

import java.math.BigDecimal;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		SalaryCalculator salaryCalculator = new SalaryCalculator();
		EmployeePrinter printer = new EmployeePrinter();

		// Polymorphism: List of base type referencing subtypes
		List<Employee> staff = List.of(
				new Developer("DEV101", "Akshat Srivastava", new BigDecimal("75000.00"), "Java & Spring Boot"),
				new Developer("DEV102", "Rohan Sharma", new BigDecimal("65000.00"), "Python & FastAPI"),
				new Manager("MGR201", "Priya Nair", new BigDecimal("120000.00"), 8));

		System.out.println("================ COMPANY PAYROLL SUMMARY ================");

		for (Employee emp : staff) {
			BigDecimal totalCompensation = salaryCalculator.calculateTotalCompensation(emp);
			printer.printEmployeeDetails(emp, totalCompensation);
		}

		System.out.println("----------------------------------------------");
	}
}
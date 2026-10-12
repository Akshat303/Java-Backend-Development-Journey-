package com.string.practice;

public class ReportGenerator {

	private static final int EMPLOYEE_COUNT = 10000;

	// Generate sample employee data
	private String generateEmployeeRecord(int id) {
		return "ID: " + id + ", Name: Employee" + id + ", Salary: " + (30000 + id) + "\n";
	}

	// Using String concatenation
	public String generateWithString() {
		String report = "";
		for (int i = 1; i <= EMPLOYEE_COUNT; i++) {
			report = report + generateEmployeeRecord(i);
		}
		return report;
	}

	// Using StringBuilder
	public String generateWithStringBuilder() {
		StringBuilder builder = new StringBuilder();
		for (int i = 1; i <= EMPLOYEE_COUNT; i++) {
			builder.append(generateEmployeeRecord(i));
		}
		return builder.toString();
	}

	// Using StringBuffer
	public String generateWithStringBuffer() {
		StringBuffer buffer = new StringBuffer();
		for (int i = 1; i <= EMPLOYEE_COUNT; i++) {
			buffer.append(generateEmployeeRecord(i));
		}
		return buffer.toString();
	}
}

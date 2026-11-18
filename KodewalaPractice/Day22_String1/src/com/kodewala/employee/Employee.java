package com.kodewala.employee;

public class Employee {

	private String employeeName;
	private String employeeId;
	private double basicSalary;
	private String[] attendance;

	private static int totalEmployees;

	public Employee(String _employeeName, String _employeeId, double _basicSalary, String[] _attendance) {

		this.employeeName = _employeeName;
		this.employeeId = _employeeId;
		this.basicSalary = _basicSalary;
		this.attendance = _attendance;

		totalEmployees++;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public String[] getAttendance() {
		return attendance;
	}

	public static void showTotalEmployees() {
		System.out.println("Total Employees: " + totalEmployees);
	}
}
package com.day40_serialization.employeeRecordSystem;

import java.io.Serializable;

public class Employee implements Serializable {

	private int empId;
	private String empName;
	private double salary;

	public Employee(int empId, String empName, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public double getSalary() {
		return salary;
	}
}
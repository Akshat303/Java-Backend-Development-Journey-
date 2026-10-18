package com.practice.hospital;

public class HospitalStaff {
	private int staffId;
	private String name;
	private String department;
	private double monthlySalary;

	public HospitalStaff(int staffId, String name, String department, double monthlySalary) {
		this.staffId = staffId;
		this.name = validateName(name);
		this.department = department;
		this.monthlySalary = validateSalary(monthlySalary);
	}

	private String validateName(String name) {
		if (name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("Name cannot be empty.");
		}
		return name;
	}

	private double validateSalary(double salary) {
		if (salary <= 0) {
			throw new IllegalArgumentException("Salary must be positive.");
		}
		return salary;
	}

	public int getStaffId() {
		return staffId;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void displayStaffDetails() {
		System.out.println("Staff ID: " + staffId);
		System.out.println("Name: " + name);
		System.out.println("Department: " + department);
		System.out.println("Monthly Salary: ₹" + monthlySalary);
	}
}

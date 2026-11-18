package com.practice.hospital;

public class Nurse extends HospitalStaff {
	private String shift;
	private int overtimeHours;

	public Nurse(int staffId, String name, String department, double monthlySalary, String shift, int overtimeHours) {
		super(staffId, name, department, monthlySalary);
		this.shift = validateShift(shift);
		this.overtimeHours = Math.max(overtimeHours, 0);
	}

	private String validateShift(String shift) {
		if (shift == null || shift.trim().isEmpty()) {
			throw new IllegalArgumentException("Shift cannot be empty.");
		}
		return shift;
	}

	public double calculateOvertimePay(double hourlyRate) {
		if (hourlyRate <= 0)
			throw new IllegalArgumentException("Hourly rate must be positive.");
		return overtimeHours * hourlyRate;
	}

	@Override
	public void displayStaffDetails() {
		super.displayStaffDetails();
		System.out.println("Shift: " + shift);
		System.out.println("Overtime Hours: " + overtimeHours);
	}
}

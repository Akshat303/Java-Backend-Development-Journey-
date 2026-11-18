package com.practice.hospital;

public class Doctor extends HospitalStaff {
	private String specialization;
	private double consultationFee;

	public Doctor(int staffId, String name, String department, double monthlySalary, String specialization,
			double consultationFee) {
		super(staffId, name, department, monthlySalary);
		this.specialization = validateSpecialization(specialization);
		this.consultationFee = validateFee(consultationFee);
	}

	private String validateSpecialization(String specialization) {
		if (specialization == null || specialization.trim().isEmpty()) {
			throw new IllegalArgumentException("Specialization cannot be empty.");
		}
		return specialization;
	}

	private double validateFee(double fee) {
		if (fee < 0)
			throw new IllegalArgumentException("Consultation fee cannot be negative.");
		return fee;
	}

	public double calculateConsultationIncome(int consultations) {
		if (consultations < 0)
			throw new IllegalArgumentException("Consultations cannot be negative.");
		return consultationFee * consultations;
	}

	@Override
	public void displayStaffDetails() {
		super.displayStaffDetails();
		System.out.println("Specialization: " + specialization);
		System.out.println("Consultation Fee: ₹" + consultationFee);
	}
}

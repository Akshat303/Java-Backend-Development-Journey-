package com.practice.hospital;

public class Main {
	public static void main(String[] args) {
		Doctor doc = new Doctor(101, "Dr. Mehta", "Cardiology", 120000, "Cardiologist", 500);
		Nurse nurse = new Nurse(102, "Sita", "ICU", 40000, "Night", 10);
		Receptionist rec = new Receptionist(103, "Raj", "Front Desk", 25000, 5, "English");

		System.out.println("---- Doctor Details ----");
		doc.displayStaffDetails();
		System.out.println("Consultation Income (20 patients): ₹" + doc.calculateConsultationIncome(20));

		System.out.println("\n---- Nurse Details ----");
		nurse.displayStaffDetails();
		System.out.println("Overtime Pay (₹200/hr): ₹" + nurse.calculateOvertimePay(200));

		System.out.println("\n---- Receptionist Details ----");
		rec.displayStaffDetails();
	}
}



package com.practice.hospital;

public class Receptionist extends HospitalStaff {
	private int deskNumber;
	private String languageKnown;

	public Receptionist(int staffId, String name, String department, double monthlySalary, int deskNumber,
			String languageKnown) {
		super(staffId, name, department, monthlySalary);
		this.deskNumber = validateDesk(deskNumber);
		this.languageKnown = validateLanguage(languageKnown);
	}

	private int validateDesk(int deskNumber) {
		if (deskNumber <= 0)
			throw new IllegalArgumentException("Desk number must be positive.");
		return deskNumber;
	}

	private String validateLanguage(String language) {
		if (language == null || language.trim().isEmpty()) {
			throw new IllegalArgumentException("Language cannot be empty.");
		}
		return language;
	}

	@Override
	public void displayStaffDetails() {
		super.displayStaffDetails();
		System.out.println("Desk Number: " + deskNumber);
		System.out.println("Language Known: " + languageKnown);
	}
}

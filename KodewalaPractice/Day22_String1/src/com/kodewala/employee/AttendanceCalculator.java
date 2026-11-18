package com.kodewala.employee;

public class AttendanceCalculator {

	private String[] attendance;

	public AttendanceCalculator(String[] attendance) {
		this.attendance = attendance;
	}

	public int calculatePresentDays() {

		int presentDays = 0;

		for (int i = 0; i < attendance.length; i++) {

			if (attendance[i].equalsIgnoreCase("P")) {
				presentDays++;
			}
		}

		return presentDays;
	}

	public int calculateAbsentDays() {

		int absentDays = 0;

		for (int i = 0; i < attendance.length; i++) {

			if (attendance[i].equalsIgnoreCase("A")) {
				absentDays++;
			}
		}

		return absentDays;
	}

	public double calculateAttendancePercentage() {

		int presentDays = calculatePresentDays();

		if (attendance.length == 0) {
			return 0;
		}

		return (presentDays * 100.0) / attendance.length;
	}

	public void attendanceMessage(String status) {

		switch (status.toUpperCase()) {

		case "P":
			System.out.println("Present");
			break;

		case "A":
			System.out.println("Absent");
			break;

		case "L":
			System.out.println("Leave");
			break;

		default:
			System.out.println("Invalid Attendance Status");
		}
	}
}
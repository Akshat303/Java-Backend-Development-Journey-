package com.practice.attendance;

public class Attendance {

	private char[] attendance;

	public Attendance(char[] attendance) {
		this.attendance = attendance;
	}

	public void calculateAttendance() {

		int present = 0;
		int absent = 0;

		for (char day : attendance) {

			if (day == 'P') {
				present++;
			} else if (day == 'A') {
				absent++;
			}
		}

		double percentage = (present * 100.0) / attendance.length;

		System.out.println("Present: " + present);
		System.out.println("Absent: " + absent);
		System.out.println("Attendance: " + percentage + "%");

		if (percentage >= 75) {
			System.out.println("Eligible for salary");
		} else {
			System.out.println("Attendance shortage");
		}
	}
}
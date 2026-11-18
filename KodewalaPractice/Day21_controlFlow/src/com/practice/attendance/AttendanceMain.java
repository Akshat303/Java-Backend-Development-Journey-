package com.practice.attendance;

import java.util.Scanner;

public class AttendanceMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of working days: ");
		int days = sc.nextInt();

		char[] attendance = new char[days];

		System.out.println("Enter attendance (P = Present, A = Absent):");

		for (int i = 0; i < attendance.length; i++) {

			System.out.print("Day " + (i + 1) + ": ");
			attendance[i] = sc.next().toUpperCase().charAt(0);
		}

		Attendance attendanceRecord = new Attendance(attendance);

		attendanceRecord.calculateAttendance();

		sc.close();
	}
}
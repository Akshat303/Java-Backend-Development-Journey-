package com.kodewala.employee;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Employee Information

		System.out.print("Employee Name: ");
		String employeeName = sc.nextLine();

		System.out.print("Employee ID: ");
		String employeeId = sc.nextLine();

		System.out.print("Basic Salary: ");
		double basicSalary = sc.nextDouble();

		System.out.print("Number of Days: ");
		int numberOfDays = sc.nextInt();

		String[] attendance = new String[numberOfDays];

		// Attendance Input

		for (int i = 0; i < attendance.length; i++) {

			System.out.print("Day " + (i + 1) + ": ");
			attendance[i] = sc.next();
		}

		// Create Employee Object

		Employee employee = new Employee(
				employeeName,
				employeeId,
				basicSalary,
				attendance
		);

		// Attendance Calculator

		AttendanceCalculator attendanceCalculator =
				new AttendanceCalculator(employee.getAttendance());

		// Calculate Attendance

		int presentDays =
				attendanceCalculator.calculatePresentDays();

		int absentDays =
				attendanceCalculator.calculateAbsentDays();

		double attendancePercentage =
				attendanceCalculator.calculateAttendancePercentage();

		// Salary Calculator

		SalaryCalculator salaryCalculator =
				new SalaryCalculator(
						employee.getBasicSalary(),
						attendancePercentage
				);

		double bonus =
				salaryCalculator.calculateBonus();

		double finalSalary =
				salaryCalculator.calculateFinalSalary();

		// Backup Attendance

		String[] backupAttendance =
				Arrays.copyOf(
						employee.getAttendance(),
						employee.getAttendance().length
				);

		boolean attendanceBackupSame =
				Arrays.equals(
						employee.getAttendance(),
						backupAttendance
				);

		// Salary Slip

		System.out.println();
		System.out.println("========== SALARY SLIP ==========");

		System.out.println();

		System.out.println("Employee: "
				+ employee.getEmployeeName());

		System.out.println("Employee ID: "
				+ employee.getEmployeeId());

		System.out.println();

		System.out.println("Present Days: "
				+ presentDays);

		System.out.println("Absent Days: "
				+ absentDays);

		System.out.printf("Attendance: %.2f%%\n",
				attendancePercentage);

		System.out.printf("Bonus: ₹%.2f\n",
				bonus);

		System.out.printf("Final Salary: ₹%.2f\n",
				finalSalary);

		System.out.println();

		System.out.println("Attendance Backup Same: "
				+ attendanceBackupSame);

		// Attendance Messages

		System.out.println();
		System.out.println("Attendance Details:");

		for (int i = 0; i < attendance.length; i++) {

			System.out.print("Day " + (i + 1) + ": ");

			attendanceCalculator.attendanceMessage(
					attendance[i]
			);
		}

		System.out.println();

		Employee.showTotalEmployees();

		sc.close();
	}
}
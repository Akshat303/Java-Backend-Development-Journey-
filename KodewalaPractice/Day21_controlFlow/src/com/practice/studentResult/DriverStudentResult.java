package com.practice.studentResult;

import java.util.Scanner;

public class DriverStudentResult {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter student name: ");
		String name = sc.nextLine();

		System.out.print("Enter Java marks: ");
		int javaMarks = sc.nextInt();

		System.out.print("Enter SQL marks: ");
		int sqlMarks = sc.nextInt();

		System.out.print("Enter DSA marks: ");
		int dsaMarks = sc.nextInt();

		StudentResult student = new StudentResult(name, javaMarks, sqlMarks, dsaMarks);

		student.calculateResult();

	}
}
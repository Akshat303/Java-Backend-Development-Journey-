package com.arrayForloop;

import java.util.Arrays;

public class DriverStudentMarks {

	public static void main(String[] args) {
		int[] marks = { 88, 76, 72, 90, 55 };

		System.out.println("Marks " + Arrays.toString(marks));

		StudentMarks student = new StudentMarks("Akshat", marks);

		System.out.println("===== STUDENT RESULT =====");

		student.displayResult();

	}

}

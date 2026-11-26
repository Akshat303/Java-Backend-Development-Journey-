package com.attendance;

public class Driver
{

	public static void main(String[] args)
	{

		StudentService service = new StudentServiceImpl();

		// Add 5 Students
		service.addStudent("Rahul");
		service.addStudent("Aman");
		service.addStudent("Neha");
		service.addStudent("Priya");
		service.addStudent("Rohit");

		// Display
		service.displayStudents();

		// Add student at index 2
		service.addStudentAtIndex(2, "Akshat");

		System.out.println("\nAfter Inserting Akshat");
		service.displayStudents();

		// Update student
		service.updateStudent(1, "Abhishek");

		System.out.println("\nAfter Update");
		service.displayStudents();

		// Contains
		service.checkStudent("Akshat");

		// Index
		service.findStudentIndex("Akshat");

		// First & Last
		service.displayFirstAndLastStudent();

		// Size
		service.displayTotalStudents();
	}
}

package com.attendance;

public interface StudentService
{

	void addStudent(String name);

	void addStudentAtIndex(int index, String name);

	void updateStudent(int index, String newName);

	void displayStudents();

	void checkStudent(String name);

	void findStudentIndex(String name);

	void displayFirstAndLastStudent();

	void displayTotalStudents();
}
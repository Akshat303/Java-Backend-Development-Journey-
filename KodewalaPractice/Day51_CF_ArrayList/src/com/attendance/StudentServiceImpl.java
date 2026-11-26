package com.attendance;

import java.util.ArrayList;

public class StudentServiceImpl implements StudentService
{

	private ArrayList<String> students = new ArrayList<>();

	// Add student at end
	@Override
	public void addStudent(String name)
	{
		students.add(name);
	}

	// Add student at specific index
	@Override
	public void addStudentAtIndex(int index, String name)
	{
		students.add(index, name);
	}

	// Update student name
	@Override
	public void updateStudent(int index, String newName)
	{
		students.set(index, newName);
	}

	// Display all students
	@Override
	public void displayStudents()
	{

		System.out.println("\n----- Student List -----");

		for (String student : students)
		{
			System.out.println(student);
		}
	}

	// Check student exists or not
	@Override
	public void checkStudent(String name)
	{

		if (students.contains(name))
		{
			System.out.println(name + " is present.");
		}
		else
		{
			System.out.println(name + " is not present.");
		}
	}

	// Find index
	@Override
	public void findStudentIndex(String name)
	{

		int index = students.indexOf(name);

		if (index != -1)
		{
			System.out.println(name + " found at index : " + index);
		}
		else
		{
			System.out.println(name + " not found.");
		}
	}

	// First and Last Student
	@Override
	public void displayFirstAndLastStudent()
	{

		if (!students.isEmpty())
		{

			System.out.println("First Student : " + students.get(0));

			System.out.println("Last Student : " + students.get(students.size() - 1));
		}
	}

	// Total Students
	@Override
	public void displayTotalStudents()
	{

		System.out.println("Total Students : " + students.size());
	}
}
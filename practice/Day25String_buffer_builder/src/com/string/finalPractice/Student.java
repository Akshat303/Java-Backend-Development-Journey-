package com.string.finalPractice;

public class Student {
	public String name;
	public int[] marks;

	public Student(String name, int[] marks) {
		this.name = name;
		this.marks = marks;
	}

	public void display() {
		System.out.print("Student: " + name + " | Marks: ");
		for (int mark : marks) {
			System.out.print(mark + " ");
		}
		System.out.println();
	}
}

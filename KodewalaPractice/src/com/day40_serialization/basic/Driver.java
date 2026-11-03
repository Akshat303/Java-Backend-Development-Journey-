package com.day40_serialization.basic;

import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws IOException {

		Student s = new Student(101, "Akshat");

		StudentSerialization ss = new StudentSerialization();

		ss.serializeStudent(s);

		System.out.println("Student object serialized successfully...");
	}
}
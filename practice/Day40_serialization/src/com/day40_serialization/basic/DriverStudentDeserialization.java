package com.day40_serialization.basic;

import java.io.IOException;

public class DriverStudentDeserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		StudentDeserialization sd = new StudentDeserialization();

		Student student = sd.deserializeStudent();

		System.out.println("Id : " + student.getId());

		System.out.println("Name : " + student.getName());
	}
}
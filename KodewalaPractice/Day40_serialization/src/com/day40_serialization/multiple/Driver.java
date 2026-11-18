package com.day40_serialization.multiple;

public class Driver {

	public static void main(String[] args) throws Exception {

		Student s1 = new Student(101, "Akshat");

		Student s2 = new Student(102, "Aman");

		StudentSerialization ss = new StudentSerialization();

		ss.serializeStudents(s1, s2);

		StudentDeserialization sd = new StudentDeserialization();

		sd.deserializeStudents();
	}
}

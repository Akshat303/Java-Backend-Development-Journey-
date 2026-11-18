package com.day40_serialization.multiple;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentDeserialization {

	public void deserializeStudents() throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("students.ser");

		ObjectInputStream ois = new ObjectInputStream(fis);

		Student s1 = (Student) ois.readObject();

		Student s2 = (Student) ois.readObject();

		System.out.println(s1.getId() + " " + s1.getName());

		System.out.println(s2.getId() + " " + s2.getName());

		ois.close();
	}
}
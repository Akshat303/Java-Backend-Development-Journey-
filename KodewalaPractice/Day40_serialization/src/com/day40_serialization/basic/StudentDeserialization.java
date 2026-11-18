package com.day40_serialization.basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentDeserialization {

	public Student deserializeStudent() throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("student.ser");

		ObjectInputStream ois = new ObjectInputStream(fis);

		Student student = (Student) ois.readObject();

		ois.close();

		return student;
	}
}

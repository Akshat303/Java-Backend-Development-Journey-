package com.day40_serialization.multiple;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentSerialization {

	public void serializeStudents(Student s1, Student s2) throws IOException {

		FileOutputStream fos = new FileOutputStream("students.ser");

		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(s1);
		oos.writeObject(s2);

		oos.close();
	}
}

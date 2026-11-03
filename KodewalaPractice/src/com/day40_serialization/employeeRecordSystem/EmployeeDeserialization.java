package com.day40_serialization.employeeRecordSystem;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeDeserialization {

	public Employee deserializeEmployee() throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("employee.ser");

		ObjectInputStream ois = new ObjectInputStream(fis);

		Employee employee = (Employee) ois.readObject();

		ois.close();

		return employee;
	}
}

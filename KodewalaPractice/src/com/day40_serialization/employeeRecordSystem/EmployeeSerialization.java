package com.day40_serialization.employeeRecordSystem;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeSerialization {

	public void serializeEmployee(Employee employee) throws IOException {

		FileOutputStream fos = new FileOutputStream("employee.ser");

		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(employee);

		oos.close();
	}
}
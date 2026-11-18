package com.day40_serialization.employeeRecordSystem;

public class Driver {

	public static void main(String[] args) throws Exception {

		Employee employee = new Employee(1, "Rahul", 50000);

		EmployeeSerialization es = new EmployeeSerialization();

		es.serializeEmployee(employee);
		System.out.println("Driver.main()...serializeEmployee");

		EmployeeDeserialization ed = new EmployeeDeserialization();

		Employee emp = ed.deserializeEmployee();

		System.out.println("Employee Id : " + emp.getEmpId());

		System.out.println("Employee Name : " + emp.getEmpName());

		System.out.println("Salary : " + emp.getSalary());
	}
}
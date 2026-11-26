package com.employee.management;

public interface EmployeeService
{

	void addEmployee(Employee employee);

	void addEmployeeAtIndex(int index, Employee employee);

	void removeEmployee(int index);

	void updateEmployeeName(int id, String newName);

	void searchEmployee(int id);

	void displayEmployees();

	void displayFirstEmployee();

	void displayLastEmployee();

	void totalEmployees();

	void createBackup();

	void keepCommonEmployees();

	void clearBackup();
}
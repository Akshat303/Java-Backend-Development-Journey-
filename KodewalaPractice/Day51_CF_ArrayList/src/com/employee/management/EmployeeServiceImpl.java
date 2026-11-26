package com.employee.management;

import java.util.ArrayList;

public class EmployeeServiceImpl implements EmployeeService
{

	private ArrayList<Employee> employees = new ArrayList<>();

	private ArrayList<Employee> backupEmployees = new ArrayList<>();

	@Override
	public void addEmployee(Employee employee)
	{
		employees.add(employee);
	}

	@Override
	public void addEmployeeAtIndex(int index, Employee employee)
	{

		employees.add(index, employee);
	}

	@Override
	public void removeEmployee(int index)
	{

		Employee removedEmployee = employees.remove(index);

		System.out.println("Removed : " + removedEmployee);
	}

	@Override
	public void updateEmployeeName(int id, String newName)
	{

		for (Employee emp : employees)
		{

			if (emp.getId() == id)
			{

				emp.setName(newName);

				System.out.println("Employee Updated Successfully");

				return;
			}
		}

		System.out.println("Employee Not Found");
	}

	@Override
	public void searchEmployee(int id)
	{

		for (Employee emp : employees)
		{

			if (emp.getId() == id)
			{

				System.out.println("Employee Found : " + emp);

				return;
			}
		}

		System.out.println("Employee Not Found");
	}

	@Override
	public void displayEmployees()
	{

		System.out.println("\n----- Employee List -----");

		for (Employee emp : employees)
		{
			System.out.println(emp);
		}
	}

	@Override
	public void displayFirstEmployee()
	{

		if (!employees.isEmpty())
		{

			System.out.println("First Employee : " + employees.get(0));
		}
	}

	@Override
	public void displayLastEmployee()
	{

		if (!employees.isEmpty())
		{

			System.out.println("Last Employee : " + employees.get(employees.size() - 1));
		}
	}

	@Override
	public void totalEmployees()
	{

		System.out.println("Total Employees : " + employees.size());
	}

	@Override
	public void createBackup()
	{

		backupEmployees.addAll(employees);

		System.out.println("Backup Created Successfully");
	}

	@Override
	public void keepCommonEmployees()
	{

		ArrayList<Employee> commonList = new ArrayList<>();

		commonList.add(employees.get(0));
		commonList.add(employees.get(1));

		backupEmployees.retainAll(commonList);

		System.out.println("Retain Operation Completed");

		System.out.println(backupEmployees);
	}

	@Override
	public void clearBackup()
	{

		backupEmployees.clear();

		System.out.println("Backup Cleared");

		System.out.println("Is Backup Empty ? " + backupEmployees.isEmpty());
	}
}
package com.employee.management;

public class Employee
{

	private int id;
	private String name;

	public Employee(int id, String name)
		{
			this.id = id;
			this.name = name;
		}

	// Getter
	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	// Setter
	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}
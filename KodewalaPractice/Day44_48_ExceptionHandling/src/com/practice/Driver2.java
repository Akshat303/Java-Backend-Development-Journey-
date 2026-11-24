package com.practice;

public class Driver2
{
	public static void main(String[] args)
	{
		String name = "Akshat";
		System.out.println(name.length()); // NullPointerException

		String className = "com.practice.Driver2";

		try
		{
			Class.forName(className); // loading the class into memory
			System.out.println("Class Found");
		}
		catch (ClassNotFoundException e)
		{

			System.err.println("Calss not found");
			e.printStackTrace();
		}

		System.out.println("class loaded...");

	}
}

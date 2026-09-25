package com.kodewala.constructors;

public class Driver {
	public static void main(String[] args) {
		User obj = new User("Akshat", "789552", "58626");
		System.out.println("Name = " + obj.userName);

		User obj1;
		obj1 = new User("Dev", "789552", "58626");

		obj1.userName = "vikash";
		System.out.println("Name = " + obj1.userName);

	}

}

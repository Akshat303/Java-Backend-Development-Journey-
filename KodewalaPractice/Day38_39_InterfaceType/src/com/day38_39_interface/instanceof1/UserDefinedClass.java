package com.day38_39_interface.instanceof1;

//Define a user-defined class
class Student {
}

public class UserDefinedClass {

	public static void main(String[] args) {
		// Instantiate the Student class
		Student s = new Student();
		// Verify that reference 's' is an instance of the Student class
		// Evaluates to true because 's' points to a valid Student object
		System.out.println(s instanceof Student);

	}

}

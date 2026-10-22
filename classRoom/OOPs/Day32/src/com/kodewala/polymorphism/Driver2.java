package com.kodewala.polymorphism;

class Employee {

	public void markIn() {
		System.out.println("Employee.markIn().......... Employee Marknig IN");
	}
}

class HRManager extends Employee {

	@Override
	public void markIn() {
		System.out.println("HRManager.markIn().......... HRManager Marknig IN");
	}
}

public class Driver2 {

	public static void main(String[] args) {

		/*
		 * Employee e1 = new Employee(); e1.markIn();
		 */

//    	Reference Type = Employee
//    	Object Type = HRManager
		Employee e2 = new HRManager(); // Parent class can refer child class object

		e2.markIn(); // Compiler check karta hai ki markIn() method Employee class me exist karta hai
						// ya nahi.

//      JVM dekhta hai actual object kis class ka hai.
		new HRManager();

		// Same method will behave differently based on the actual object.
		// 1. At compilation time, it checks whether the method exists in Employee.
		// 2. At runtime, it calls the method of the actual object (HRManager).
	}
}
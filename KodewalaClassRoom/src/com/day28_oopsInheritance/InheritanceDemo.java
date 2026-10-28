package com.day28_oopsInheritance;

class Employee {
	String name = "Amit";
	String address = "Bangalore";

	private String empCode = "IC1234";

	public void markIn(String empId) {
		System.out.println("Marking IN " + empId);
	}
}

class Manager extends Employee { // Manager IS-A Employee
	public void doSomething() {
		System.out.println("Name " + name); // using the parent class attributes
		System.out.println("Name " + address); // using the parent class attributes
		// System.out.println(empCode); // private member not accessible
		markIn("Emp21"); // using the parent class method
		markIn(address); // using the parent class method
	}
}

public class InheritanceDemo {
	public static void main(String[] args) {
		Manager mgr = new Manager();
		mgr.doSomething();
	}
}

package com.day41_deepCloning;

public class Employee implements Cloneable { // Level -1

	String name; // copy
	String empCode; // copy
	Address address; // HAS-A // copy only reference not object.

	public Employee(String name, String empCode, Address address) {
		super();
		this.name = name;
		this.empCode = empCode;
		this.address = address;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Employee e = (Employee) super.clone();
		e.address = (Address) address.clone();
		return e;
	}

}
package com.day41_shallowCloning;

public class Employee implements Cloneable {

	String name;
	String empCode;
	Address address;

	public Employee(String name, String empCode, Address address) {
		super();
		this.name = name;
		this.empCode = empCode;
		this.address = address;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

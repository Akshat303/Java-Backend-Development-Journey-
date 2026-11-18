package com.day41_deepCloning;

public class Address implements Cloneable { // Level - 2
	String line1;
	String line2;
	String city;

	public Address(String line1, String line2, String city) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

package com.kodewala.constructors;

public class User {
	String name;
	String type;
	String country;
	String mobileNo;

	User(String _name, String _type, String _country, String _mobileNo) {
		this.name = _name;
		this.type = _type;
		this.country= _country;
		this.mobileNo = _mobileNo;
	}
	
	public  User() {
		/**
		 * system is getting / default value
		 */
		this("user", "dumy", "IN", "989865320");
	}
	
	
	/**
	 * print method
	 */
	void display(){
		System.out.println("Name = " + name);
		System.out.println("Type = " + type);
		System.out.println("Country = " + country);
		System.out.println("Mobile No = " + mobileNo);
	}

}

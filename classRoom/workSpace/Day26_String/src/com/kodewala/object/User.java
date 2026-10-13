package com.kodewala.object;

public class User {
	String userNmae;
	String UserId;
	String mobileNumber;

	// static block will get executed just after the class loading

	static {
		System.out.println("I am static block init block 1");
	}

	public User(String _userNmae, String _userId, String _mobileNumber) {
		super(); // Either super or this
		System.out.println("String _userNmae, String _userId, String _mobileNumber");
		this.userNmae = _userNmae;
		UserId = _userId;
		this.mobileNumber = _mobileNumber;
	}
	
	static {
		System.out.println("I am static block init block 2");
	}

}

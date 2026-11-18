package com.kodewala.constructors;

class SuperUser extends Object {

}

public class User extends SuperUser {
	String userName;
	String userId;
	String mobile;

	User(String _userName, String _userId, String _mobile) {
		
		this (300); //calling same class(user) constructor
		this.userName = _userName;
		this.userId = _userId;
		this.mobile = _mobile;
	}
	
	User(int age){
		System.out.println("User() .. no args " + age);
	}
}

package com.modifire.package1;

public class StudentPublic {

//	Public --> kahin se bhi access kar sakte.

	public String name = "Akshat"; // Public

	public void display() { // public
		System.out.println("Name - " + name);
	}

}

/*
 
🎯 One-line Memory Trick
private   → Same Class
default   → Same Package
protected → Same Package + Child
public    → Everywhere

*/
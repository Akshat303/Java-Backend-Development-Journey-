package com.modifire.package1;

public class StudentProtected {

	protected String name = "Akshat Protected";

	protected void display() {
		System.out.println("Protected = " + name);
	}

}



/*
protected
↓
Same Package ✅
↓
Different Package + Child Class ✅
↓
Normal Different Class ❌

*/
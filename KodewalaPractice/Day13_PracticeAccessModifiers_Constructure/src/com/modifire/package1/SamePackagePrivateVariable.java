package com.modifire.package1;

public class SamePackagePrivateVariable {
	public static void main(String[] args) {
		StudentPrivate stPrivateVar = new StudentPrivate();
		
//		stPrivateVar.setName("Akshat Private var"); over write  varName data 
		
		System.out.println("Private var - " + stPrivateVar.getName());
 	}

}


/* 
 Student.java
    ↓
private variable
    ↓
setName()  → value set/change
getName()  → value read
    ↓
Main.java
    ↓
s.setName("Akshat")
s.getName()
  */

/*
When access private variable in another package
Simple rule:
private variable
       ↓
Directly from another class       ❌
Directly from another package     ❌
Through public getter/method      ✅

*/

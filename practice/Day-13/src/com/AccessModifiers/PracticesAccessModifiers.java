package com.AccessModifiers;

public class PracticesAccessModifiers {

	
	//Private 
	private String  fName= "Akshat";
	private int age = 26;
	
	
	public static void main (String[] args) {
		PracticesAccessModifiers myObj = new PracticesAccessModifiers () ;
			
		 System.out.println(myObj.fName);
		 System.out.println(myObj.age);
		
		
	}
}

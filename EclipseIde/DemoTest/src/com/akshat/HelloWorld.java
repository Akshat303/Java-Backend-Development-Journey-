package com.akshat;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		int amount = 500;
		 String myNmae = (args[0]);
		System.out.println("My name is " + myNmae);
		System.out.println("Amount = " + amount); 
		HelloWorld.doSomething();
		
//		Scanner sc = new Scanner(System.in);
//		 System.out.println("Enter no.");
	}
	
	public static void doSomething() {
		System.out.println("Do something class");
		
	}
	

}

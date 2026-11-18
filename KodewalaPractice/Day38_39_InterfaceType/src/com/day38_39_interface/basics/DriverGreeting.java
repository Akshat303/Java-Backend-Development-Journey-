package com.day38_39_interface.basics;

public class DriverGreeting {

	public static void main(String[] args) {
		Greeting greet = new Message();
		greet.greet();
		System.out.println(greet.myName());
		

	}

}

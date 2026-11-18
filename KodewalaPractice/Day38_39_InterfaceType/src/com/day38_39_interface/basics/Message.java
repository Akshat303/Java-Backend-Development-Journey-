package com.day38_39_interface.basics;

public class Message implements Greeting{

	@Override
	public void greet() {
		System.out.println("Message.greet() Good Morning");
		
	}

	@Override
	public String myName() {
		return "Akshat";
	}

}

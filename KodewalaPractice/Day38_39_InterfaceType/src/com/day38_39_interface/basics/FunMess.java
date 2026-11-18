package com.day38_39_interface.basics;

public class FunMess implements FunctionalGreeting{

	@Override
	public String mess() {
		String myMess = "Welcome to Java";
		return myMess;
	}

}

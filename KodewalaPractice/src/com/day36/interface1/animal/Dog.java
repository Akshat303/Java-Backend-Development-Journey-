package com.day36.interface1.animal;

public class Dog implements Animal {

	@Override
	public void sound() {
		System.out.println("Dog sound barks");
	}

	@Override
	public void eat() {
		System.out.println("Dog is omnivores");
		
	}
}

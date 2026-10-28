package com.day36_interface.animal;

public class Tiger implements Animal {

	@Override
	public void sound() {
		System.out.println("Tiger sound roar");
		
	}

	@Override
	public void eat() {
		System.out.println("Tiger is carnivores");
		
	}

}

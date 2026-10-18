package com.single.animalSounds;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	@Override
	public void makeSound() {
		System.out.println("Dog barks");
	}
}

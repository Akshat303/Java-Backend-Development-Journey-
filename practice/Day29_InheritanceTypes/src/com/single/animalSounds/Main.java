package com.single.animalSounds;

public class Main {

	public static void main(String[] args) {

		Animal animal = new Animal("Generic Animal");
		animal.makeSound();

		Animal dog = new Dog("Tommy");
		dog.makeSound();

		System.out.println("Dog Name: " + dog.getName());
	}
}
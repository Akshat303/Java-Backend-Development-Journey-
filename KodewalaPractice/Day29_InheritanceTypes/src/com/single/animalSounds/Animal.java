package com.single.animalSounds;

public class Animal {

	private final String name;

	public Animal(String name) {
		validateName(name);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void makeSound() {
		System.out.println("Animal makes a sound");
	}

	protected static void validateName(String name) {
		if (name == null || name.isBlank()) {
			throw new IllegalArgumentException("Animal name cannot be null or empty");
		}
	}
}

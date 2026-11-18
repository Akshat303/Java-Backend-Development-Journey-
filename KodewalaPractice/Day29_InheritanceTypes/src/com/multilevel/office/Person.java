package com.multilevel.office;

public class Person {

    private final String name;
    private final int age;

    public Person(String name, int age) {
        validateName(name);
        validateAge(age);

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private static void validateName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException(
                    "Name cannot be null or empty");
        }
    }

    private static void validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException(
                    "Age cannot be negative");
        }
    }
}
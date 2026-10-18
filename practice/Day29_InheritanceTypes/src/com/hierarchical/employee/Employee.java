package com.hierarchical.employee;

public class Employee {

    private final String name;
    private final double basicSalary;

    public Employee(String name, double basicSalary) {
        validateName(name);
        validateSalary(basicSalary);

        this.name = name;
        this.basicSalary = basicSalary;
    }

    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double calculateSalary() {
        return basicSalary;
    }

    private static void validateName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException(
                    "Employee name cannot be empty");
        }
    }

    private static void validateSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException(
                    "Basic salary cannot be negative");
        }
    }
}
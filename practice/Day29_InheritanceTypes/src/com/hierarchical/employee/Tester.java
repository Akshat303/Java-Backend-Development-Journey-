package com.hierarchical.employee;

public class Tester extends Employee {

    private final double testingBonus;

    public Tester(String name,
                  double basicSalary,
                  double testingBonus) {

        super(name, basicSalary);

        if (testingBonus < 0) {
            throw new IllegalArgumentException(
                    "Testing bonus cannot be negative");
        }

        this.testingBonus = testingBonus;
    }

    public double getTestingBonus() {
        return testingBonus;
    }

    @Override
    public double calculateSalary() {
        return getBasicSalary() + testingBonus;
    }
}
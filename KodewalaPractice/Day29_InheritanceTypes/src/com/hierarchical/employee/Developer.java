package com.hierarchical.employee;

public class Developer extends Employee {

    private final double projectBonus;

    public Developer(String name,
                     double basicSalary,
                     double projectBonus) {

        super(name, basicSalary);

        if (projectBonus < 0) {
            throw new IllegalArgumentException(
                    "Project bonus cannot be negative");
        }

        this.projectBonus = projectBonus;
    }

    public double getProjectBonus() {
        return projectBonus;
    }

    @Override
    public double calculateSalary() {
        return getBasicSalary() + projectBonus;
    }
}
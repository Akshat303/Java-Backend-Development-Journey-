package com.hierarchical.employee;

public class Manager extends Employee {

    private final double managementAllowance;

    public Manager(String name,
                   double basicSalary,
                   double managementAllowance) {

        super(name, basicSalary);

        if (managementAllowance < 0) {
            throw new IllegalArgumentException(
                    "Management allowance cannot be negative");
        }

        this.managementAllowance = managementAllowance;
    }

    public double getManagementAllowance() {
        return managementAllowance;
    }

    @Override
    public double calculateSalary() {
        return getBasicSalary() + managementAllowance;
    }
}
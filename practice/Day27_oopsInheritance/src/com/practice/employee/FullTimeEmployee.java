package com.practice.employee;

public class FullTimeEmployee extends Employee {
    private double annualBonus;

    // Constructor chaining
    public FullTimeEmployee(int employeeId, String name, double baseSalary, double annualBonus) {
        super(employeeId, name, baseSalary);
        this.annualBonus = Math.max(annualBonus, 0); // prevent negative
    }

    // Calculate annual compensation
    public double getAnnualCompensation() {
        return (getBaseSalary() * 12) + annualBonus;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Annual Bonus: ₹" + annualBonus);
        System.out.println("Annual Compensation: ₹" + getAnnualCompensation());
    }
}

package com.practice.employee;

public class Employee {
    private int employeeId;
    private String name;
    private double baseSalary; // monthly base salary

    // Constructor
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = Math.max(baseSalary, 0); // prevent negative
    }

    // Getters
    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }

    // Display details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary (Monthly): ₹" + baseSalary);
    }
}

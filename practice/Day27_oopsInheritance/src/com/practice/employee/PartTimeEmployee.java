package com.practice.employee;

public class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    // Constructor chaining
    public PartTimeEmployee(int employeeId, String name, double hourlyRate, int hoursWorked) {
        super(employeeId, name, 0); // baseSalary not applicable for part-time
        this.hourlyRate = Math.max(hourlyRate, 0);
        this.hoursWorked = Math.max(hoursWorked, 0);
    }

    // Calculate salary
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void displayDetails() {
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Name: " + getName());
        System.out.println("Hourly Rate: ₹" + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Total Salary: ₹" + calculateSalary());
    }
}

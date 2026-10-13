package com.practice.objectBlock;

public class Employee {

    // Static members
    private static int employeeCount;
    private static final String COMPANY_NAME;

    // Instance members
    private int employeeId;
    private String employeeName;

    // Static block
    static {
        COMPANY_NAME = "XYZ Corporation";
        employeeCount = 0;
        System.out.println("Company initialized: " + COMPANY_NAME);
    }

    // Instance initialization block (IIB)
    {
        employeeCount++;
        employeeId = employeeCount; // assign unique ID
        System.out.println("Employee ID generated: " + employeeId);
    }

    // Constructor
    public Employee(String employeeName) {
        this.employeeName = employeeName;
        System.out.println("Employee object created");
    }

    // Display method
    public void displayEmployee() {
        System.out.println("Company: " + COMPANY_NAME +
                           ", Employee ID: " + employeeId +
                           ", Name: " + employeeName);
    }

    // Static method to show total employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + employeeCount);
    }
}

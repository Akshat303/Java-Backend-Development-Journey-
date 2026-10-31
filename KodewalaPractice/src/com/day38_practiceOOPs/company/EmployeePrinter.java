package com.day38_practiceOOPs.company;

import java.math.BigDecimal;

public class EmployeePrinter {

    public void printEmployeeDetails(Employee employee, BigDecimal totalCompensation) {
        System.out.println("----------------------------------------------");
        System.out.println("Employee ID   : " + employee.getId());
        System.out.println("Name          : " + employee.getName());
        System.out.println("Role          : " + employee.getRole());
        System.out.println("Base Salary   : ₹" + employee.getBaseSalary());

        // Polymorphic check for specific attributes
        if (employee instanceof Developer dev) {
            System.out.println("Tech Stack    : " + dev.getProgrammingLanguage());
        } else if (employee instanceof Manager mgr) {
            System.out.println("Team Size     : " + mgr.getTeamSize() + " members");
        }

        System.out.println("Total Payout  : ₹" + totalCompensation);
    }
}
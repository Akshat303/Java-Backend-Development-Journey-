package com.hierarchical.employee;

public class Main {

    public static void main(String[] args) {

        Employee[] employees = {
                new Developer("Rahul", 40000, 8000),
                new Tester("Ravi", 35000, 5000),
                new Manager("Akshat", 60000, 15000)
        };

        for (Employee employee : employees) {

            System.out.println(
                    employee.getClass().getSimpleName());

            System.out.println(
                    "Name : " + employee.getName());

            System.out.println(
                    "Final Salary : ₹" +
                    employee.calculateSalary());

            System.out.println("-------------------");
        }
    }
}
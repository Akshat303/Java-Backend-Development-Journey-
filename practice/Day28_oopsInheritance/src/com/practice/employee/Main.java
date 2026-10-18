package com.practice.employee;

public class Main {
    public static void main(String[] args) {
        // Full-time employee
        FullTimeEmployee fte = new FullTimeEmployee(101, "Rohit", 40000, 60000);
        fte.displayDetails();

        System.out.println("----------------------------");

        // Part-time employee
        PartTimeEmployee pte = new PartTimeEmployee(102, "Aditya", 500, 40);
        pte.displayDetails();
    }
}

package com.multilevel.office;

public class Manager extends Employee {

    private final int teamSize;

    public Manager(String name,
                   int age,
                   int employeeId,
                   double salary,
                   int teamSize) {

        super(name, age, employeeId, salary);

        validateTeamSize(teamSize);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void displayDetails() {
        System.out.println("Name        : " + getName());
        System.out.println("Age         : " + getAge());
        System.out.println("Employee ID : " + getEmployeeId());
        System.out.println("Salary      : ₹" + getSalary());
        System.out.println("Team Size   : " + getTeamSize());
    }

    private static void validateTeamSize(int teamSize) {
        if (teamSize < 0) {
            throw new IllegalArgumentException(
                    "Team size cannot be negative");
        }
    }
}
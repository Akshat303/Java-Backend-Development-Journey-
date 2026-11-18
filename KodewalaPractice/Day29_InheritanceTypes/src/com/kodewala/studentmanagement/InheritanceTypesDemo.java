
package com.kodewala.studentmanagement;

class PersonLevel {

    private String name;

    public PersonLevel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class EmployeeLevel extends PersonLevel {

    private int employeeId;

    public EmployeeLevel(String name, int employeeId) {
        super(name);
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }
}

class ManagerLevel extends EmployeeLevel {

    private int teamSize;

    public ManagerLevel(String name, int employeeId, int teamSize) {
        super(name, employeeId);
        this.teamSize = teamSize;
    }

    public void display() {
        System.out.println("Name: " + getName());
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Team Size: " + teamSize);
    }
}

public class InheritanceTypesDemo {

    public static void main(String[] args) {

        ManagerLevel manager =
                new ManagerLevel("Akshat", 101, 5);

        manager.display();
    }
}

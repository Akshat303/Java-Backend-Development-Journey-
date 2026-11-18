package com.multilevel.schoolmanagement;

public class Teacher extends School {

    private final String teacherName;
    private final double salary;

    public Teacher(String schoolName,
                   String teacherName,
                   double salary) {

        super(schoolName);

        validateTeacherName(teacherName);
        validateSalary(salary);

        this.teacherName = teacherName;
        this.salary = salary;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public double getSalary() {
        return salary;
    }

    public void displayTeacherDetails() {
        System.out.println("School Name : " + getSchoolName());
        System.out.println("Teacher Name: " + teacherName);
        System.out.println("Salary      : ₹" + salary);
    }

    private static void validateTeacherName(String teacherName) {
        if (teacherName == null || teacherName.isBlank()) {
            throw new IllegalArgumentException(
                    "Teacher name cannot be empty");
        }
    }

    private static void validateSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException(
                    "Salary cannot be negative");
        }
    }
}
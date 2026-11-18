package com.studentmanagement;

public class StudentManager {

    private Student[] students;
    private int studentCount;

    public StudentManager(int capacity) {

        students = new Student[capacity];
        studentCount = 0;
    }

    public void addStudent(Student student) {

        if (studentCount >= students.length) {

            System.out.println(
                    "Student Storage Full");
            return;
        }

        students[studentCount++] = student;

        System.out.println(
                "Student Added Successfully");
    }

    public void displayAllStudents() {

        if (studentCount == 0) {

            System.out.println(
                    "No Students Available");
            return;
        }

        for (int i = 0; i < studentCount; i++) {

            students[i].displayStudentDetails();
        }
    }

    public void searchStudent(int rollNumber) {

        for (int i = 0; i < studentCount; i++) {

            if (students[i].getRollNumber()
                    == rollNumber) {

                students[i].displayStudentDetails();
                return;
            }
        }

        System.out.println(
                "Student Not Found");
    }

    public void displayTopper() {

        if (studentCount == 0) {

            System.out.println(
                    "No Students Available");
            return;
        }

        Student topper = students[0];

        for (int i = 1; i < studentCount; i++) {

            if (students[i]
                    .calculatePercentage()
                    > topper.calculatePercentage()) {

                topper = students[i];
            }
        }

        System.out.println("\n===== TOPPER =====");

        topper.displayStudentDetails();
    }

    public void displayStudentsByType(
            String studentType) {

        boolean found = false;

        for (int i = 0; i < studentCount; i++) {

            if (students[i]
                    .getStudentType()
                    .equalsIgnoreCase(studentType)) {

                students[i].displayStudentDetails();

                found = true;
            }
        }

        if (!found) {

            System.out.println(
                    "No Students Found");
        }
    }
}
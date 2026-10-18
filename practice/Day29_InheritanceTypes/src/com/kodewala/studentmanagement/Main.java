
package com.kodewala.studentmanagement;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static StudentManager manager = new StudentManager(10);

    public static void main(String[] args) {

        // Command-line argument demonstration
        if (args.length > 0) {
            System.out.println("Application started with: "
                    + args[0]);
        } else {
            System.out.println("Welcome to Student Management System");
        }

        int choice;

        do {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Regular Student");
            System.out.println("2. Add Online Student");
            System.out.println("3. Display All Students");
            System.out.println("4. Search Student");
            System.out.println("5. Display Topper");
            System.out.println("6. Display Students by Type");
            System.out.println("7. Display Student Count");
            System.out.println("0. Exit");

            choice = readInt("Enter choice: ");

            switch (choice) {

                case 1:
                    addStudent(false);
                    break;

                case 2:
                    addStudent(true);
                    break;

                case 3:
                    manager.displayAllStudents();
                    break;

                case 4:
                    searchStudent();
                    break;

                case 5:
                    manager.displayTopper();
                    break;

                case 6:
                    displayByType();
                    break;

                case 7:
                    System.out.println("Total stored students: "
                            + manager.getStudentCount());

                    System.out.println("Total created Student objects: "
                            + Student.getTotalStudents());

                    System.out.println("Array capacity: "
                            + manager.getCapacity());
                    break;

                case 0:
                    System.out.println("Application closed.");
                    break;

                default:
                    System.out.println("Invalid menu choice.");
            }

        } while (choice != 0);

        sc.close();
    }

    private static void addStudent(boolean online) {

        if (manager.getStudentCount() >= 10) {
            System.out.println("Student storage is full.");
            return;
        }

        System.out.print("Enter student name: ");
        String name = sc.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("Name cannot be empty.");
            return;
        }

        int rollNumber = readInt("Enter roll number: ");

        if (rollNumber <= 0) {
            System.out.println("Roll number must be positive.");
            return;
        }

        // Check duplicate before constructing a student
        if (manager.searchStudent(rollNumber) != null) {
            System.out.println("Roll number already exists.");
            return;
        }

        int[] marks = new int[5];

        System.out.println("Enter marks for 5 subjects:");

        for (int i = 0; i < marks.length; i++) {

            while (true) {

                marks[i] = readInt("Subject " + (i + 1) + ": ");

                if (marks[i] >= 0 && marks[i] <= 100) {
                    break;
                }

                System.out.println("Marks must be between 0 and 100.");
            }
        }

        Student student;

        if (online) {

            System.out.print("Enter course name: ");
            String courseName = sc.nextLine().trim();

            if (courseName.isEmpty()) {
                System.out.println("Course name cannot be empty.");
                return;
            }

            student = new OnlineStudent(
                    name, rollNumber, marks, courseName);

        } else {

            System.out.print("Enter classroom name: ");
            String classroomName = sc.nextLine().trim();

            if (classroomName.isEmpty()) {
                System.out.println("Classroom name cannot be empty.");
                return;
            }

            student = new RegularStudent(
                    name, rollNumber, marks, classroomName);
        }

        manager.addStudent(student);
    }

    private static void searchStudent() {

        int rollNumber = readInt("Enter roll number to search: ");

        Student student = manager.searchStudent(rollNumber);

        if (student != null) {
            System.out.println("\nStudent found:");
            student.displayStudentDetails();
        } else {
            System.out.println("Student not found.");
        }
    }

    private static void displayByType() {

        System.out.print("Enter type (Regular/Online): ");
        String type = sc.nextLine();

        manager.displayStudentsByType(type);
    }

    // Input validation without exception handling
    private static int readInt(String message) {

        while (true) {

            System.out.print(message);

            if (sc.hasNextInt()) {

                int value = sc.nextInt();
                sc.nextLine(); // Consume the remaining newline

                return value;
            }

            System.out.println("Please enter a valid integer.");
            sc.nextLine();
        }
    }
}

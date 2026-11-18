package com.kodewala.studentresult;

import java.util.Scanner;

public class StudentMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take student name
        System.out.print("Enter student name: ");
        String studentName = sc.nextLine();

        // Take number of subjects
        System.out.print("Enter number of subjects: ");
        int size = sc.nextInt();

        // Dynamic arrays
        String[] subjects = new String[size];

        int[] marks = new int[size];

        // Take subject names and marks
        for (int i = 0; i < size; i++) {

            sc.nextLine();

            System.out.print("Enter subject " + (i + 1) + " name: ");
            subjects[i] = sc.nextLine();

            System.out.print("Enter marks for " + subjects[i] + ": ");
            marks[i] = sc.nextInt();
        }

        // Create StudentResult object
        StudentResult student = new StudentResult(
                studentName,
                subjects,
                marks
        );

        // Display result
        student.displayResult();

        // Search student
        sc.nextLine();

        System.out.print("\nEnter student name to search: ");
        String searchName = sc.nextLine();

        if (student.isStudent(searchName)) {
            System.out.println("Student Found");
        } 
        else {
            System.out.println("Student Not Found");
        }

        // Display total students
        StudentResult.showStudentCount();

        sc.close();
    }
}
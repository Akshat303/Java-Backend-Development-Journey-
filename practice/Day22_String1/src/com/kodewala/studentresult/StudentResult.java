package com.kodewala.studentresult;

import java.util.Arrays;

public class StudentResult {

    private String studentName;
    private String[] subjects;
    private int[] marks;

    private static int studentCount;

    // Constructor
    public StudentResult(String _studentName, String[] _subjects, int[] _marks) {
        this.studentName = _studentName;
        this.subjects = _subjects;
        this.marks = _marks;

        studentCount++;
    }

    // Calculate total marks
    public int calculateTotal() {

        int total = 0;

        for (int i = 0; i < marks.length; i++) {
            total = total + marks[i];
        }

        return total;
    }

    // Calculate average marks
    public double calculateAverage() {

        int total = calculateTotal();

        return (double) total / marks.length;
    }

    // Calculate grade
    public char calculateGrade() {

        double average = calculateAverage();

        if (average >= 90) {
            return 'A';
        } 
        else if (average >= 75) {
            return 'B';
        } 
        else if (average >= 60) {
            return 'C';
        } 
        else if (average >= 40) {
            return 'D';
        } 
        else {
            return 'F';
        }
    }

    // Check pass/fail
    public boolean isPassed() {

        for (int i = 0; i < marks.length; i++) {

            // Put breakpoint here
            if (marks[i] < 40) {
                return false;
            }
        }

        return true;
    }

    // Search student name
    public boolean isStudent(String searchName) {

        return studentName.equalsIgnoreCase(searchName);
    }

    // Display complete result
    public void displayResult() {

        System.out.println("\n========== STUDENT RESULT ==========");

        System.out.println("Student Name : " + studentName);

        System.out.println("\nSubject-wise Marks:");

        for (int i = 0; i < subjects.length; i++) {

            System.out.println(subjects[i] + " : " + marks[i]);
        }

        System.out.println("\nTotal Marks  : " + calculateTotal());

        System.out.println("Average      : " + calculateAverage());

        System.out.println("Grade        : " + calculateGrade());

        if (isPassed()) {
            System.out.println("Result       : PASS");
        } 
        else {
            System.out.println("Result       : FAIL");
        }

        // Extra Challenge
        int[] sortedMarks = Arrays.copyOf(marks, marks.length);

        Arrays.sort(sortedMarks);

        System.out.println("Lowest Marks : " + sortedMarks[0]);

        System.out.println("Highest Marks: "
                + sortedMarks[sortedMarks.length - 1]);

        System.out.println("====================================");
    }

    // Static method to display student count
    public static void showStudentCount() {

        System.out.println("\nTotal Students Created: " + studentCount);
    }
}
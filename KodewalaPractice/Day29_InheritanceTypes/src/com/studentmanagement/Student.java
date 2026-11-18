package com.studentmanagement;

public class Student {

    private String studentName;
    private int rollNumber;
    private int[] marks;
    private String studentType;

    private static int totalStudents;

    public Student() {
        this("Unknown",
                1,
                new int[]{0, 0, 0, 0, 0},
                "Unknown");
    }

    public Student(String studentName,
                   int rollNumber,
                   int[] marks,
                   String studentType) {

        if (studentName == null || studentName.trim().isEmpty()) {
            System.out.println("Invalid Student Name");
            return;
        }

        if (rollNumber <= 0) {
            System.out.println("Invalid Roll Number");
            return;
        }

        if (marks == null || marks.length != 5) {
            System.out.println("Exactly 5 subject marks required");
            return;
        }

        for (int mark : marks) {
            if (mark < 0 || mark > 100) {
                System.out.println("Marks must be between 0 and 100");
                return;
            }
        }

        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.marks = marks.clone();
        this.studentType = studentType;

        totalStudents++;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getStudentType() {
        return studentType;
    }

    public int[] getMarks() {
        return marks.clone();
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

    public int calculateTotalMarks() {

        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        return total;
    }

    public double calculatePercentage() {
        return calculateTotalMarks() / 5.0;
    }

    public String getGrade() {

        double percentage = calculatePercentage();

        if (percentage >= 90)
            return "A";
        else if (percentage >= 75)
            return "B";
        else if (percentage >= 60)
            return "C";
        else if (percentage >= 40)
            return "D";

        return "FAIL";
    }

    public void displayStudentDetails() {

        System.out.println("\n===== STUDENT DETAILS =====");
        System.out.println("Name : " + studentName);
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Type : " + studentType);
        System.out.println("Total Marks : " +
                calculateTotalMarks() + " / 500");
        System.out.println("Percentage : " +
                calculatePercentage() + " %");
        System.out.println("Grade : " +
                getGrade());
    }
}
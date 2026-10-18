package com.studentmanagement;

public class OnlineStudent extends Student {

    private String courseName;

    public OnlineStudent(String studentName,
                         int rollNumber,
                         int[] marks,
                         String courseName) {

        super(studentName,
                rollNumber,
                marks,
                "Online");

        this.courseName = courseName;
    }

    public double calculateFinalFee(double baseFee) {

        return baseFee + (baseFee * 0.10);
    }

    @Override
    public void displayStudentDetails() {

        super.displayStudentDetails();

        System.out.println(
                "Course Name : " +
                        courseName);
    }
}


package com.kodewala.studentmanagement;

public class OnlineStudent extends Student {

    private String courseName;

    public OnlineStudent() {
        this("Unknown", 1, new int[] {0, 0, 0, 0, 0},
                "Unknown");
    }

    public OnlineStudent(String studentName, int rollNumber,
                         int[] marks, String courseName) {

        super(studentName, rollNumber, marks, "Online");

        this.courseName =
                (courseName != null
                && !courseName.trim().isEmpty())
                ? courseName.trim() : "Unknown";
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {

        if (courseName != null
                && !courseName.trim().isEmpty()) {
            this.courseName = courseName.trim();
        } else {
            System.out.println("Invalid course name.");
        }
    }

    public double calculateFinalFee(double baseFee) {

        if (baseFee > 0) {
            return baseFee + (baseFee * 0.10);
        }

        return 0;
    }

    @Override
    public void displayStudentDetails() {

        super.displayStudentDetails();

        System.out.println("Course: " + courseName);
        System.out.println("Final Fee: "
                + calculateFinalFee(1000));
    }
}


package com.kodewala.studentmanagement;

public class Student {

    private String studentName;
    private int rollNumber;
    private int[] marks;
    private String studentType;

    private static int totalStudents = 0;

    // Default constructor using this()
    public Student() {
        this("Unknown", 1, new int[] {0, 0, 0, 0, 0}, "General");
    }

    // Parameterized constructor
    public Student(String studentName, int rollNumber,
                   int[] marks, String studentType) {

        this.studentName =
                (studentName != null && !studentName.trim().isEmpty())
                ? studentName.trim() : "Unknown";

        this.rollNumber = rollNumber > 0 ? rollNumber : 1;

        this.marks = copyValidMarks(marks);

        this.studentType =
                (studentType != null && !studentType.trim().isEmpty())
                ? studentType.trim() : "General";

        totalStudents++;
    }

    // Validate and copy marks
    private int[] copyValidMarks(int[] inputMarks) {

        int[] result = new int[5];

        if (inputMarks == null || inputMarks.length != 5) {
            return result;
        }

        for (int i = 0; i < inputMarks.length; i++) {

            if (inputMarks[i] < 0 || inputMarks[i] > 100) {
                return new int[] {0, 0, 0, 0, 0};
            }

            result[i] = inputMarks[i];
        }

        return result;
    }

    // Getters
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
        return copyValidMarks(marks);
    }

    // Controlled setters
    public void setStudentName(String studentName) {

        if (studentName != null && !studentName.trim().isEmpty()) {
            this.studentName = studentName.trim();
        } else {
            System.out.println("Invalid student name.");
        }
    }

    public void setMarks(int[] marks) {

        if (marks != null && marks.length == 5) {

            boolean valid = true;

            for (int mark : marks) {
                if (mark < 0 || mark > 100) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                this.marks = copyValidMarks(marks);
            } else {
                System.out.println("Marks must be between 0 and 100.");
            }

        } else {
            System.out.println("Exactly five marks are required.");
        }
    }

    // Calculate total marks
    public int calculateTotalMarks() {

        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        return total;
    }

    // Calculate percentage
    public double calculatePercentage() {
        return calculateTotalMarks() / 5.0;
    }

    // Calculate grade
    public String getGrade() {

        double percentage = calculatePercentage();

        if (percentage >= 90) {
            return "A";
        } else if (percentage >= 75) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 40) {
            return "D";
        } else {
            return "Fail";
        }
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

    // Protected method for child classes
    protected String getDisplayCategory() {
        return studentType;
    }

    // Common display method
    public void displayStudentDetails() {

        System.out.println("Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Type: " + getDisplayCategory());
        System.out.println("Total Marks: "
                + calculateTotalMarks() + " / 500");
        System.out.printf("Percentage: %.2f%%%n",
                calculatePercentage());
        System.out.println("Grade: " + getGrade());
    }
}

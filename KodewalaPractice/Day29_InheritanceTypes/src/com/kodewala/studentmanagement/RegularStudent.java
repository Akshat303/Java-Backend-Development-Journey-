
package com.kodewala.studentmanagement;

public class RegularStudent extends Student {

    private String classroomName;

    public RegularStudent() {
        this("Unknown", 1, new int[] {0, 0, 0, 0, 0},
                "Unknown");
    }

    public RegularStudent(String studentName, int rollNumber,
                          int[] marks, String classroomName) {

        super(studentName, rollNumber, marks, "Regular");

        this.classroomName =
                (classroomName != null
                && !classroomName.trim().isEmpty())
                ? classroomName.trim() : "Unknown";
    }

    public String getClassroomName() {
        return classroomName;
    }

    public void setClassroomName(String classroomName) {

        if (classroomName != null
                && !classroomName.trim().isEmpty()) {
            this.classroomName = classroomName.trim();
        } else {
            System.out.println("Invalid classroom name.");
        }
    }

    public double calculateFinalFee(double baseFee) {

        if (baseFee > 0) {
            return baseFee;
        }

        return 0;
    }

    @Override
    public void displayStudentDetails() {

        super.displayStudentDetails();

        System.out.println("Classroom: " + classroomName);
        System.out.println("Final Fee: "
                + calculateFinalFee(1000));
    }
}

package com.studentmanagement;

public class RegularStudent extends Student {

    private String classroomName;

    public RegularStudent(String studentName,
                          int rollNumber,
                          int[] marks,
                          String classroomName) {

        super(studentName,
                rollNumber,
                marks,
                "Regular");

        this.classroomName = classroomName;
    }

    public double calculateFinalFee(double baseFee) {
        return baseFee;
    }

    @Override
    public void displayStudentDetails() {

        super.displayStudentDetails();

        System.out.println(
                "Classroom : " +
                        classroomName);
    }
}
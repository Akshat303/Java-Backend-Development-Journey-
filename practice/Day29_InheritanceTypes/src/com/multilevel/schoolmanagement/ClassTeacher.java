package com.multilevel.schoolmanagement;

public class ClassTeacher extends Teacher {

    private final String className;
    private final int studentCount;

    public ClassTeacher(String schoolName,
                        String teacherName,
                        double salary,
                        String className,
                        int studentCount) {

        super(schoolName, teacherName, salary);

        validateClassName(className);
        validateStudentCount(studentCount);

        this.className = className;
        this.studentCount = studentCount;
    }

    public String getClassName() {
        return className;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public int calculateStudentTeacherWorkload() {
        return studentCount;
    }

    @Override
    public void displayTeacherDetails() {

        super.displayTeacherDetails();

        System.out.println("Class Name  : " + className);
        System.out.println("Students    : " + studentCount);
        System.out.println(
                "Workload    : "
                        + calculateStudentTeacherWorkload()
                        + " students");
    }

    private static void validateClassName(String className) {
        if (className == null || className.isBlank()) {
            throw new IllegalArgumentException(
                    "Class name cannot be empty");
        }
    }

    private static void validateStudentCount(int studentCount) {
        if (studentCount < 0) {
            throw new IllegalArgumentException(
                    "Student count cannot be negative");
        }
    }
}

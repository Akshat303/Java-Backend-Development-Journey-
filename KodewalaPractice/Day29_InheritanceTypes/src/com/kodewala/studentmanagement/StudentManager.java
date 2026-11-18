
package com.kodewala.studentmanagement;

public class StudentManager {

    private Student[] students;
    private int studentCount;

    public StudentManager() {
        this(10);
    }

    public StudentManager(int capacity) {

        if (capacity > 0) {
            students = new Student[capacity];
        } else {
            students = new Student[10];
        }

        studentCount = 0;
    }

    // Add a student
    public boolean addStudent(Student student) {

        if (student == null) {
            System.out.println("Invalid student.");
            return false;
        }

        if (studentCount >= students.length) {
            System.out.println("Student storage is full.");
            return false;
        }

        // Prevent duplicate roll numbers
        if (searchStudent(student.getRollNumber()) != null) {
            System.out.println("Roll number already exists.");
            return false;
        }

        students[studentCount] = student;
        studentCount++;

        System.out.println("Student added successfully!");
        return true;
    }

    // Display all students
    public void displayAllStudents() {

        if (studentCount == 0) {
            System.out.println("No students available.");
            return;
        }

        for (int i = 0; i < studentCount; i++) {

            System.out.println("\n===== STUDENT "
                    + (i + 1) + " =====");

            // Runtime object decides which overridden method runs
            students[i].displayStudentDetails();
        }
    }

    // Search by roll number
    public Student searchStudent(int rollNumber) {

        for (int i = 0; i < studentCount; i++) {

            if (students[i].getRollNumber() == rollNumber) {
                return students[i];
            }
        }

        return null;
    }

    // Display topper
    public void displayTopper() {

        if (studentCount == 0) {
            System.out.println("No students available.");
            return;
        }

        Student topper = students[0];

        for (int i = 1; i < studentCount; i++) {

            if (students[i].calculateTotalMarks()
                    > topper.calculateTotalMarks()) {

                topper = students[i];
            }
        }

        System.out.println("\n===== TOPPER =====");
        topper.displayStudentDetails();
    }

    // Display students by type
    public void displayStudentsByType(String studentType) {

        if (studentType == null || studentType.trim().isEmpty()) {
            System.out.println("Invalid student type.");
            return;
        }

        boolean found = false;

        for (int i = 0; i < studentCount; i++) {

            if (students[i].getStudentType()
                    .equalsIgnoreCase(studentType.trim())) {

                students[i].displayStudentDetails();
                System.out.println("------------------");

                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching students found.");
        }
    }

    public int getStudentCount() {
        return studentCount;
    }

    // Package-private method: accessible within this package
    int getCapacity() {
        return students.length;
    }
}

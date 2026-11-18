package com.practice.objectBlock;

public class StudentDriver {
    public static void main(String[] args) {

        // Before creating any student
        Student.displayTotalStudents();

        // Creating students
        Student s1 = new Student("Akshat", 101);
        Student s2 = new Student("Rahul", 102);
        Student s3 = new Student("Aman", 103);

        // Display individual details
        s1.displayStudent();
        s2.displayStudent();
        s3.displayStudent();

        // Display total count again
        Student.displayTotalStudents();
    }
}

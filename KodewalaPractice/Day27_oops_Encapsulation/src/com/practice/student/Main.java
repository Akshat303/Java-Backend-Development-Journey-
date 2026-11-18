package com.practice.student;



public class Main {
    public static void main(String[] args) {
    	StudentResultSystem s1 = new StudentResultSystem("Akshat", 101);

        // Valid marks
        s1.setMarks(85);
        s1.displayStudent();

        // Invalid marks
        s1.setMarks(120); // rejected
        s1.displayStudent(); // still shows 85
    }
}


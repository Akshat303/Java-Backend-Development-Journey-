package com.scan_while;
import java.util.Scanner;

public class StudentMarks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int count = 1;
        int total = 0;
        int passed = 0;

        while (count <= students) {

            System.out.print("Enter marks for student " + count + ": ");
            int marks = sc.nextInt();

            total = total + marks;

            if (marks >= 40) {
                passed++;
            }

            count++;
        }

        double average = (double) total / students;

        System.out.println("Total Marks = " + total);
        System.out.println("Average Marks = " + average);
        System.out.println("Students Passed = " + passed);

        sc.close();
    }
}
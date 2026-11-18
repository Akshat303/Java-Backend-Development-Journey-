package com.studentmanagement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentManager manager =
                new StudentManager(100);

        int choice;

        do {

            System.out.println(
                    "\n===== STUDENT MANAGEMENT SYSTEM =====");

            System.out.println(
                    "1. Add Regular Student");

            System.out.println(
                    "2. Add Online Student");

            System.out.println(
                    "3. Display All Students");

            System.out.println(
                    "4. Search Student");

            System.out.println(
                    "5. Display Topper");

            System.out.println(
                    "6. Display Students By Type");

            System.out.println(
                    "7. Exit");

            System.out.print(
                    "Enter Choice : ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    sc.nextLine();

                    System.out.print(
                            "Enter Name : ");

                    String regName =
                            sc.nextLine();

                    System.out.print(
                            "Enter Roll Number : ");

                    int regRoll =
                            sc.nextInt();

                    int[] regMarks =
                            new int[5];

                    for (int i = 0;
                         i < regMarks.length;
                         i++) {

                        System.out.print(
                                "Enter Subject "
                                        + (i + 1)
                                        + " Marks : ");

                        regMarks[i] =
                                sc.nextInt();
                    }

                    sc.nextLine();

                    System.out.print(
                            "Enter Classroom : ");

                    String classroom =
                            sc.nextLine();

                    manager.addStudent(
                            new RegularStudent(
                                    regName,
                                    regRoll,
                                    regMarks,
                                    classroom));

                    break;

                case 2:

                    sc.nextLine();

                    System.out.print(
                            "Enter Name : ");

                    String onlineName =
                            sc.nextLine();

                    System.out.print(
                            "Enter Roll Number : ");

                    int onlineRoll =
                            sc.nextInt();

                    int[] onlineMarks =
                            new int[5];

                    for (int i = 0;
                         i < onlineMarks.length;
                         i++) {

                        System.out.print(
                                "Enter Subject "
                                        + (i + 1)
                                        + " Marks : ");

                        onlineMarks[i] =
                                sc.nextInt();
                    }

                    sc.nextLine();

                    System.out.print(
                            "Enter Course Name : ");

                    String course =
                            sc.nextLine();

                    manager.addStudent(
                            new OnlineStudent(
                                    onlineName,
                                    onlineRoll,
                                    onlineMarks,
                                    course));

                    break;

                case 3:

                    manager.displayAllStudents();
                    break;

                case 4:

                    System.out.print(
                            "Enter Roll Number : ");

                    int roll =
                            sc.nextInt();

                    manager.searchStudent(roll);

                    break;

                case 5:

                    manager.displayTopper();
                    break;

                case 6:

                    sc.nextLine();

                    System.out.print(
                            "Enter Type : ");

                    String type =
                            sc.nextLine();

                    manager
                            .displayStudentsByType(type);

                    break;

                case 7:

                    System.out.println(
                            "Exiting Application...");

                    break;

                default:

                    System.out.println(
                            "Invalid Choice");
            }

        } while (choice != 7);

        sc.close();
    }
}
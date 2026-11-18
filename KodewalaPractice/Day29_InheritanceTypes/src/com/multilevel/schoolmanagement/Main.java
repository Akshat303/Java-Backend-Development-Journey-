package com.multilevel.schoolmanagement;

public class Main {

    public static void main(String[] args) {

        ClassTeacher teacher =
                new ClassTeacher(
                        "DAV School",
                        "Akshat",
                        45000,
                        "10-A",
                        40);

        teacher.displayTeacherDetails();
    }
}
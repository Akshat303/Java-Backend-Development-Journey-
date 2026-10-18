package com.multilevel.office;

public class Main {

    public static void main(String[] args) {

        Manager manager = new Manager(
                "Akshat",
                25,
                101,
                60000,
                5
        );

        manager.displayDetails();
    }
}
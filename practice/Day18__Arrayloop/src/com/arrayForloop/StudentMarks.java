package com.arrayForloop;

public class StudentMarks {

    String name;
    int[] marks;

    // Constructor
    public StudentMarks(String _name, int[] _marks) {
        this.name = _name;
        this.marks = _marks;
    }

    public int calculateTotal() {

        int total = 0;

        for (int i = 0; i < marks.length; i++) {
            total = total + marks[i];
        }

        return total;
    }

    public double calculateAverage() {

        return (double) calculateTotal() / marks.length;
    }

    public int findHighest() {

        int highest = marks[0];

        for (int i = 1; i < marks.length; i++) {

            if (marks[i] > highest) {
                highest = marks[i];
            }
        }

        return highest;
    }

    public int findLowest() {

        int lowest = marks[0];

        for (int i = 1; i < marks.length; i++) {

            if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }

        return lowest;
    }

    public boolean isPassed() {

        for (int i = 0; i < marks.length; i++) {

            if (marks[i] < 40) {
                return false;
            }
        }

        return true;
    }

    public void displayResult() {

        System.out.println("Student Name = " + name);
        System.out.println("Total = " + calculateTotal());
        System.out.println("Average = " + calculateAverage());
        System.out.println("Highest = " + findHighest());
        System.out.println("Lowest = " + findLowest());

        if (isPassed()) {
            System.out.println("Result = PASS");
        } else {
            System.out.println("Result = FAIL");
        }
    }
}
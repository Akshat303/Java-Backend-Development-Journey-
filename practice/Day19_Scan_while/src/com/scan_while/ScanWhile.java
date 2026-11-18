package com.scan_while;


import java.util.Scanner;

public class ScanWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int correctPin = 1234;
        int pin = 0;

        while (pin != correctPin) {

            System.out.print("Enter your PIN: ");
            pin = sc.nextInt();

            if (pin == correctPin) {
                System.out.println("Login Successful!");
            } else {
                System.out.println("Wrong PIN. Try again.");
            }
        }

        sc.close();
    }
}
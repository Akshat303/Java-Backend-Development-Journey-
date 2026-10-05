package com.scan_while;

import java.util.Scanner;

public class ATMWithdrawal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 10000;
        int amount = -1;

        while (amount != 0) {

            System.out.print("Enter withdrawal amount (0 to exit): ");
            amount = sc.nextInt();

            if (amount == 0) {
                break;
            }

            if (amount <= balance) {

                balance = balance - amount;

                System.out.println("Withdrawal Successful");
                System.out.println("Remaining Balance = ₹" + balance);

            } else {

                System.out.println("Insufficient Balance");
            }
        }

        System.out.println("Thank you for using ATM.");

        sc.close();
    }
}
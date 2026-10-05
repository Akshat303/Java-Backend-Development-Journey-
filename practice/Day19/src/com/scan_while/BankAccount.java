package com.scan_while;
import java.util.Scanner;

public class BankAccount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 5000;
        int choice = 0;

        while (choice != 4) {

            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {

                System.out.println("Balance = ₹" + balance);

            } else if (choice == 2) {

                System.out.print("Enter deposit amount: ");
                int deposit = sc.nextInt();

                balance = balance + deposit;

                System.out.println("Deposit Successful");

            } else if (choice == 3) {

                System.out.print("Enter withdrawal amount: ");
                int withdraw = sc.nextInt();

                if (withdraw <= balance) {

                    balance = balance - withdraw;

                    System.out.println("Withdrawal Successful");

                } else {

                    System.out.println("Insufficient Balance");
                }

            } else if (choice == 4) {

                System.out.println("Thank you for using our bank!");

            } else {

                System.out.println("Invalid Choice");
            }
        }

        sc.close();
    }
}
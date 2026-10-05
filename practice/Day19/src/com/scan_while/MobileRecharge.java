package com.scan_while;

import java.util.Scanner;

public class MobileRecharge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int amount;
        int total = 0;

        while (true) {

            System.out.print("Enter recharge amount (0 to stop): ");
            amount = sc.nextInt();

            if (amount == 0) {
                break;
            }

            total = total + amount;
        }

        System.out.println("Total Recharge = ₹" + total);

        sc.close();
    }
}
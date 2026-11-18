package com.scan_while;
import java.util.Scanner;

public class ShoppingCart {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double total = 0;
        double price = -1;

        while (price != 0) {

            System.out.print("Enter product price (0 to stop): ");
            price = sc.nextDouble();

            total = total + price;
        }

        System.out.println("Total Amount = ₹" + total);

        sc.close();
    }
}
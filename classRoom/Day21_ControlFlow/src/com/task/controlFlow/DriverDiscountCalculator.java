package com.task.controlFlow;

import java.util.Scanner;

public class DriverDiscountCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter customer type (Gold/Silver/Regular): ");
        String customerType = scanner.nextLine();

        System.out.print("Enter purchase amount: ");
        double purchaseAmount = scanner.nextDouble();

        DiscountCalculator discountCalculator =
                new DiscountCalculator(customerType, purchaseAmount);

        double discountAmount = discountCalculator.calculateDiscount();
        double finalAmount = purchaseAmount - discountAmount;

        System.out.println("\n----- Discount Details -----");
        System.out.println("Customer Type   : " + customerType);
        System.out.println("Purchase Amount : " + purchaseAmount);
        System.out.println("Discount        : " + discountAmount);
        System.out.println("Final Amount    : " + finalAmount);

    }
}
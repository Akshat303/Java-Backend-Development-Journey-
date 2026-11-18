package com.scan_while;
public class FoodOrder {

    private int totalBill = 0;

    public void displayMenu() {

        System.out.println("\n===== FOOD MENU =====");
        System.out.println("1. Pizza    - ₹250");
        System.out.println("2. Burger   - ₹150");
        System.out.println("3. Sandwich - ₹100");
        System.out.println("4. Exit");
    }

    public void addItem(int price) {

        totalBill = totalBill + price;

        System.out.println("Item Added Successfully!");
        System.out.println("Current Bill = ₹" + totalBill);
    }

    public int getTotalBill() {

        return totalBill;
    }
}
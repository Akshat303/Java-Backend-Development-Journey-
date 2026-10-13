package com.practice.objectBlock;

public class BankAccountDriver {
    public static void main(String[] args) {

        // Access static member before creating objects
        System.out.println("Accessing static member: " + BankAccount.bankName);

        // Create first account
        BankAccount acc1 = new BankAccount("Akshat", 23457);
        acc1.display();

        // Create second account
        BankAccount acc2 = new BankAccount("Rahul", 5000);
        acc2.display();

        // Call Default constructor
        BankAccount acc3 = new BankAccount();
        acc3.display();
        
        // Change static bank name
        BankAccount.bankName = "XYZ Bank";

        // Display again to show effect of static change
        acc1.display();
        acc2.display();
    }
}

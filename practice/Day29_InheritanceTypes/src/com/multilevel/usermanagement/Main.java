package com.multilevel.usermanagement;

public class Main {

    public static void main(String[] args) {

        PremiumUser user = new PremiumUser(
                "Akshat",
                "akshat@gmail.com",
                499
        );

        System.out.println("Username : "
                + user.getUsername());

        System.out.println("Email : "
                + user.getEmail());

        System.out.println("Annual Fee : ₹"
                + user.calculateAnnualFee());

        user.deactivateAccount();

        System.out.println("\nAccount Deactivated");

        System.out.println("Annual Fee : ₹"
                + user.calculateAnnualFee());
    }
}
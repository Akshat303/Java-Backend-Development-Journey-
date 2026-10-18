package com.hierarchical.payment;

public class Main {

    public static void main(String[] args) {

        PaymentMethod[] payments = {

                new UPIPayment(
                        "Akshat",
                        1500,
                        "akshat@paytm"),

                new CardPayment(
                        "Rahul",
                        2500,
                        "1234"),

                new NetBankingPayment(
                        "Amit",
                        5000,
                        "HDFC Bank")
        };

        for (PaymentMethod payment : payments) {

            System.out.println(
                    payment.getClass()
                           .getSimpleName());

            payment.processPayment();

            System.out.println("--------------------");
        }
    }
}
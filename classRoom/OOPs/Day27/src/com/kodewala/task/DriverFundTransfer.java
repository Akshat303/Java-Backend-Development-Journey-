package com.kodewala.task;

public class DriverFundTransfer {

    public static void main(String[] args) {
        FundTransfer user = new FundTransfer("Akshat", "3456787654", 1000);
        System.out.println("Initial Balance: " + user.getBalance());

        user.receiveFund(50);
        System.out.println("After Receiving: " + user.getBalance());

        user.sendFund(60);
        System.out.println("After Sending: " + user.getBalance());
    }
}

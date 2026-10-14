package com.kodewala.task;

public class DriverFundTransfer {

	public static void main(String[] args) {

		FundTransfer user = new FundTransfer("Akshat", "3456787654", 1000);
		System.out.println("Your Balance: " + user.getBalance());

		user.reciveFund(50);
		System.out.println("After Recive Balance: " + user.getBalance());

		user.sendFund(60);
		System.out.println("After Send Balance: " + user.getBalance());

	}

}

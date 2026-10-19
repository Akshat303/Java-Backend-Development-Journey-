package com.kodewala.abstraction1;

public class AccountMgmt {

	public static void main(String[] args) {

		Account account = new Account();

		boolean status = account.openAccount("Akshat", "Bangalore", "ABCDE1234F");

		System.out.println("Account Opened : " + status);
	}
}
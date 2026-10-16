package com.kodewala.oopsInheritance3;

class Account {
	public void openAccount(String userId, String email) {
		System.out.println("Account.openAccount()");
	}
}

class SavingAccount extends Account {
	@Override
	public void openAccount(String userId, String email) {
		System.out.println("SavingAccount.openAccount()");
	}
}

class SriCitAccount extends SavingAccount {
//	@Override
//	public void openAccount(String userId, String email) {
//		System.out.println("SriCitAccount.openAccount()");
//	}
}

class PensionAccount extends SriCitAccount {
	@Override
	public void openAccount(String userId, String email) {
		System.out.println("PensionAccount.openAccount()");
	}
}

public class Driver {

	public static void main(String[] args) {

		Account acc1 = new Account();
		acc1.openAccount("ak", "em");

		SriCitAccount acc2 = new SriCitAccount();
		acc2.openAccount(null, null);

	}

}

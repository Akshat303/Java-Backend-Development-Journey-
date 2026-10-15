
package com.kodewala.oopsInheritance;

public class Driver {

	public static void main(String[] args) {

		// Using SavingAccount class which inherits from Account
		SavingAccount savingAcc = new SavingAccount();

		// Call the method to open a saving account
		savingAcc.openSavingAccount("Akshat", "Bengaluru", "Savings");

		// You can also directly use Account class
		Account acc = new Account();
		acc.openBankAccount("Rohan", "Delhi", "Current");
	}
}

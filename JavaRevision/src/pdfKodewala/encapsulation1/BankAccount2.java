package pdfKodewala.encapsulation1;

public class BankAccount2 {

	private double balance; // Private data member

	public BankAccount2(double initialBalance) // Constructor to set initial balance
	{
		if (initialBalance >= 0) {
			balance = initialBalance;
		}
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) // method of deposit
	{
		if (amount > 0) {
			balance = balance + amount;
		} else {
			System.out.println("Invalid deposit amount");
		}
	}

	public boolean withdraw(double amount) // Method to withdraw money with security
	{
		if (amount > 0 && amount <= balance) {
			balance = balance - amount;
			return true;
		}

		return false;
	}
}

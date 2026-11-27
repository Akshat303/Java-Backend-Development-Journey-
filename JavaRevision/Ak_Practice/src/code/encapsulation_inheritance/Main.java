package code.encapsulation_inheritance;

public class Main {
	public static void main(String[] args) {

		BankAccount2 account = new BankAccount2(1000);
		account.deposit(2500);

		System.out.println("Initial Balance: " + account.getBalance());

		account.deposit(500);

		System.out.println("After Deposit: " + account.getBalance());

		boolean success = account.withdraw(300);

		System.out.println("Withdrawal Successful: " + success);
		System.out.println("Final Balance: " + account.getBalance());
	}
}

class BankAccount2 {

	private double balance;

	public BankAccount2(double initialBalance) {
		if (initialBalance >= 0) {
			balance = initialBalance;
		}
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
		} else {
			System.out.println("Invalid deposit amount");
		}
	}

	public boolean withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance = balance - amount;
			return true;
		}

		return false;
	}
}

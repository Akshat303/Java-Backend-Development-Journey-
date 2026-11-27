package pdfKodewala.encapsulation1;

public class MainBankAccount2 {

	public static void main(String[] args) {

		BankAccount2 account = new BankAccount2(1000);

		System.out.println("Initial Balance: " + account.getBalance());

		account.deposit(500);

		System.out.println("After Deposit: " + account.getBalance());

		boolean success = account.withdraw(300);

		System.out.println("Withdrawal Successful: " + success);
		System.out.println("Final Balance: " + account.getBalance());
	}
}

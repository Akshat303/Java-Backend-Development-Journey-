package pdfKodewala.encapsulation1;

class BankAccount {
	public double balance;

	private int balanceNot; // this is private but when update in difference class then use method is called
							// getter

//	Getter
	public void ChangeBal(int balanceNot) {
		this.balanceNot = balanceNot;
		System.out.println("update bal " + balanceNot);
	}
}

public class PracticeEncapsulation {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();

		account.balance = 1000; // direct update value
		account.balance = -50000;
		System.out.println("Account " + account.balance);

		BankAccount accPrivate = new BankAccount();
		// accPrivate.balanceNot = "3458"; // this balance is not update because this
		// variable is private

//		Setter
		accPrivate.ChangeBal(200); // // this way is balance is update using public method

		accPrivate.balance = 457;
		System.out.println("accPrivate " + accPrivate.balance);
	}
}
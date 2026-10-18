package pdfKodewala.encapsulation1;

public class MainATM {

	public static void main(String[] args) {

		ATM atm = new ATM(5000, "1234");

		atm.deposit(1000, "1234");
		atm.withdraw(1500, "1234");

		System.out.println("Balance: " + atm.getBalance("1234"));

		atm.withdraw(1000, "0000");
	}
}

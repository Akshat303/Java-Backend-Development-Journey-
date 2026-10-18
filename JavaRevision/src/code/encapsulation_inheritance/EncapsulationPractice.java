package code.encapsulation_inheritance;

public class EncapsulationPractice {

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		System.out.println(b1.getBalance());
		b1.deposit(500);
		System.out.println(b1.getBalance());
		b1.withdrw(122);
		System.out.println(b1.getBalance());

	}

}

class BankAccount {
	private double balance;

	public void deposit(int amount) {
		balance += amount;
	}

	public void withdrw(int amount) {
		balance -= amount;
	}

	double getBalance() {
		return balance;
	}
}
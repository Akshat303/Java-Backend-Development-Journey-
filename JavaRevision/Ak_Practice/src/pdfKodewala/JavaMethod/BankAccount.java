package pdfKodewala.JavaMethod;

public class BankAccount
{

	private double balance = 10000;

	protected double calculateInterest()
	{
		return balance * 0.05;
	}

	void bankInternalMessage()
	{
		System.out.println("Internal bank operation");
	}

	public void deposit(double amount)
	{

		if (amount > 0)
		{
			balance = balance + amount;
			System.out.println("Deposit successful");
		}
		else
		{
			System.out.println("Invalid amount");
		}
	}

	public double getBalance()
	{
		return balance;
	}

	public static void main(String[] args)
	{

		BankAccount account = new BankAccount();

		System.out.println("Initial Balance: " + account.getBalance());

		account.deposit(5000);

		System.out.println("Updated Balance: " + account.getBalance());

		System.out.println("Interest: " + account.calculateInterest());

		account.bankInternalMessage();
	}
}
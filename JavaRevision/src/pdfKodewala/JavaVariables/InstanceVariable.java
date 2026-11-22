package pdfKodewala.JavaVariables;

public class InstanceVariable
{
	int age = 25; // instance variable
	int balance; // instance variable

	public InstanceVariable()
		{

			this.balance = 200;
		}

	public static void main(String[] args)
	{
		InstanceVariable iv = new InstanceVariable();

		System.out.println("Age - " + iv.age);
		System.out.println("Balance - " + iv.balance);
		iv.balance = 272;
		System.out.println("Upadte Balance - " + iv.balance);

	}

}

package pdfKodewala.JavaVariables;

// Declare the variable and  assign the value later

public class JavaVariable
{
	int days = 100; // Declaring and initializing variable

	int accountBalance; // Declaring the variable

	public static void main(String[] args)
	{
		String location = "BTM";
		System.out.println(location);

		System.out.println("JavaVariable.main()");

		JavaVariable obj = new JavaVariable(); // create object
		obj.doSomething();
		obj.accountBalance = 200; // assigning the value
		System.out.println(obj.accountBalance);

	}

	public void doSomething()
	{
		accountBalance = 1000; // assigning the value
		System.out.println(accountBalance);

	}

}

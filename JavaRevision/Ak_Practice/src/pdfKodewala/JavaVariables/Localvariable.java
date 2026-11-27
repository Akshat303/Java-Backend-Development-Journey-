package pdfKodewala.JavaVariables;

/*
Local variables are defined within methods or blocks (if, else etc.) or constructors.
The scope of local variables is within methods, blocks or constructors.
*/

public class Localvariable
{

	public static void main(String[] args)
	{
		int age = 26; // Declared a local variable

		// This variable is local to this main method only
		System.out.println(age);

		int balance; // only Declaring and not initializing variable
		// Initialization of local variable is must. If you do not initialize it, you

		// System.out.println(balance);// will get compile error.

	}

}

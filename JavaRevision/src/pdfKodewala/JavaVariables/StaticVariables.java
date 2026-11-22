package pdfKodewala.JavaVariables;

public class StaticVariables
{
	static int bal = 200;

	public static void main(String[] args)
	{
		// accessing the static variable directly without class name
		System.out.println("Bal = " + bal);

//		Best practice: Static variable ko class name se access karo.
		
		// access the static variable using class name
		StaticVariables.bal = 233;
		// bal = 2343;
		System.out.println("Bal = " + StaticVariables.bal);

	}

}

package pdfKodewala.JavaVariables;

public class LocalVariableScope
{

	public static void main(String[] args)
	{
		String name = "Akshat";
		int age1 = 21;

		if (age1 > 18)
		{
			String valid = "You can Drive";
			System.out.println(name);
			System.out.println(valid);
		}
		else
		{
			System.out.println("Not Drive");
		}

		/*
		 * Rule: Local variable ka scope us block ke andar hota hai jahan woh declare
		 * kiya gaya hai.
		 */

		// System.out.println(valid); // Error
		System.out.println("Your age - " + age1);

	}

}

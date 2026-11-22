package pdfKodewala.ExceptionHandling;

public class ExceptionHandling
{

	public static void main(String[] args)
	{
		System.out.println("ExceptionHandling.main()... Start");

		try
		{
			int result = 10 / 0;
			System.out.println("Result " + result);
		}
		catch (ArithmeticException e)
		{

			System.err.println("Cannot divide by zero");
			e.printStackTrace(); // for developer use see error
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		System.out.println("ExceptionHandling.main()... End");

		/*
		 * When not use try catch System.out.println("Program ended");
		 * 
		 * Ye execute nahi hua. Why? Java execution flow mein exception aane ke baad
		 * normal execution interrupt ho jata hai.
		 * 
		 * Agar exception handle nahi hoti, toh current execution terminate ho sakti
		 * hai, aur stack mein exception propagate hoti hai.
		 */

	}

}

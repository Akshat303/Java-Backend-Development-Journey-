package pdfKodewala.ExceptionHandling;

public class ArrayIndexOutOfBoundsExceptionExample
{

	public static void main(String[] args)
	{
		int[] number = { 10, 32, 43, 55 };

		System.out.println("ArrayIndexOutOfBoundsException.main()... Start");

		try
		{
			System.out.println(number[2]);
			System.out.println(number[4]);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.err.println("Invalid array index");
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.err.println(e.toString());

		}

		System.out.println("ArrayIndexOutOfBoundsExceptionExample.main()... End");

	}
	/*
	 * What is e inside catch? catch (ArithmeticException e)
	 * 
	 * e exception object ka reference hai.
	 * 
	 * Is object ke through hum exception ki information le sakte hain. catch
	 * (ArithmeticException e) { System.out.println(e.getMessage());
	 * System.out.println(e.toString()); }
	 * 
	 * Common methods: Method Purpose getMessage() Error message toString()
	 * Exception type + message printStackTrace() Detailed stack trace for debugging
	 */

}

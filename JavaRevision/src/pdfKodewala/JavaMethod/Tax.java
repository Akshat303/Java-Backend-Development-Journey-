package pdfKodewala.JavaMethod;

public class Tax
{

	public static void main(String[] args)
	{
		double result = taxCalculatore.calculateTex(256);
		System.out.println("1. " + result);

		System.out.println("2. " + taxCalculatore.calculateTex(10099));
	}

}

class taxCalculatore
{
	static double calculateTex(double amount)
	{

		return amount * 0.18;

	}
}
package pdfKodewala.JavaMethod;

import java.util.Random;

public class NoParametersReturn
{

	public static void main(String[] args)
	{
		GetNumber gn = new GetNumber();
		int result = gn.getRandomNo();
		System.out.println(result);

	}

}

class GetNumber
{
	int getRandomNo() // User-defined Methods
	{
		Random random = new Random(); // Built-in Methods
		int min = 1;
		int max = 100;
		int randomNumber = random.nextInt(max - min + 1) + min;
		return randomNumber;
	}
}

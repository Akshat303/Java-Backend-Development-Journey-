package pdfKodewala.JavaMethod;

public class ParametersNoReturn
{

	public static void main(String[] args)
	{
		
		Calculator c = new Calculator();
		c.add(2, 7);

	}

}

class Calculator 
{
	void add(int a, int b)
	{
		int sum = a + b;
		System.out.println(sum);

	}
}
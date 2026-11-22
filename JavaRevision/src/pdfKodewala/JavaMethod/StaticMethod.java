package pdfKodewala.JavaMethod;

public class StaticMethod
{

	public static void main(String[] args)
	{
		int result = Multiply.multi(4, 2);
		System.out.println(result);

		// Multiply m = new Multiply();
		// int mu = m.multi(7, 4);
		// System.out.println(mu);

	}

}

class Multiply
{

	static int multi(int x, int y)
	{
		return x * y;
	}

}
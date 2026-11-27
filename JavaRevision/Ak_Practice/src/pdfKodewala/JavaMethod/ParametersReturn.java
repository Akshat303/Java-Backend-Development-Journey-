package pdfKodewala.JavaMethod;

public class ParametersReturn
{

	public static void main(String[] args)
	{
		Addition add = new Addition();
		int result = add.sum(3, 8);
		System.out.println(result);

	}

}

class Addition
{
	int sum(int a, int b)
	{
		return a + b;

	}
}

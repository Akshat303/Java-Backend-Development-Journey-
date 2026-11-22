package pdfKodewala.JavaMethod;

public class NoParametersNoReturn
{

	public static void main(String[] args)
	{

		AddNo sum = new AddNo();
		sum.add();

	}

}

class AddNo
{
	void add()
	{
		int a = 10;
		int b = 12;
		System.out.println(a + b);
	}
}
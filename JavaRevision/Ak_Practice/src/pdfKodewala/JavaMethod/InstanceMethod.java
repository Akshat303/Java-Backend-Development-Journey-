package pdfKodewala.JavaMethod;

public class InstanceMethod
{
	public static void main(String[] args)
	{

		Add add1 = new Add();
		int result = add1.addTwoNo(22, 21);
		System.out.println(result);

	}
}

class Add
{
	public int addTwoNo(int num1, int num2)
	{
		int sum = num1 + num2;
		return sum;
	}
}
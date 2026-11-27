package pdfKodewala.JavaMethod;

public class MethodCallingUsingObject
{

	public static void main(String[] args)
	{

		Kodewala obj = new Kodewala();
		obj.displayMessage();

	}

}

class Kodewala
{
	void displayMessage()
	{
		System.out.println("Kodewala.displayMessage()... Welcome ");
	}
}
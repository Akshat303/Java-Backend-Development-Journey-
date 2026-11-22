package pdfKodewala.ScopeVariables;

public class Scopevariable
{

	// Member variable (inside the class, but outside any body)
	String itemName = "Realme";
	int price = 12300;

	public static void main(String[] args)
	{
		Scopevariable sv = new Scopevariable();
		sv.display();

	}

	private void display()
	{
		System.out.println(itemName);
		System.out.println(price);

	}

}

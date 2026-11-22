package pdfKodewala.JavaVariables;

public class IVUsingConstructor
{

	public static void main(String[] args)
	{
		Emp e1 = new Emp(101, "Akshat");
		Emp e2 = new Emp(102, "Rahul");

		System.out.println(e1.id + " " + e1.name);
		System.out.println(e2.id + " " + e2.name);

	}

}

class Emp
{
	int id;
	String name;

	public Emp(int id, String name) // constructor
		{
			// this.id → Current object's instance variable.
			// id → Constructor ka parameter/local variable.
			this.id = id;
			this.name = name;
		}
}
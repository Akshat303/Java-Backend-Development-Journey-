package pdfKodewala.JavaVariables;

/*
employeeName → Individual employee ki property.
employeeId → Individual employee ki property.
companyName → Shared property.
 */

public class SVExample
{

	public static void main(String[] args)
	{
		Employee2 e1 = new Employee2();
		Employee2 e2 = new Employee2();

		e1.id = 101;
		e1.name = "Akshat";

		e2.id = 102;
		e2.name = "Rahul";

		System.out.println(e1.id + " " + e1.name + " " + Employee2.company);
		System.out.println(e2.id + " " + e2.name + " " + Employee2.company);

		Employee2.company = "Google";
		System.out.println(e1.id + " " + e1.name + " " + Employee2.company);
		System.out.println(e2.id + " " + e2.name + " " + Employee2.company);

	}

}

class Employee2
{

	int id;
	String name;

	static String company = "Kodewala";

}

package pdfKodewala.JavaVariables;

public class MainEmpIV
{

	public static void main(String[] args)
	{
		// Har object ke paas instance variables ki apni copy hoti hai.

		Employee emp1 = new Employee();
		Employee emp2 = new Employee();

		emp1.id = 101;
		emp1.name = "Raj";

		emp2.id = 212;
		emp2.name = "Ravi";

		emp1.display();
		emp2.display();

		// Each object has its own instance variable values.

	}

}

class Employee
{
	int id;
	String name;

	public void display()
	{
		System.out.println("ID " + id);
		System.out.println("Name " + name);
	}
}

package pdfKodewala.JavaMethod;

public class StaticInstance
{

	public static void main(String[] args)
	{
		Employee e1 = new Employee(); // Instance method call create obj

		e1.name = "Akshat";
		e1.salary = 50000;
		e1.displayEmp();
		Employee e2 = new Employee();

		Employee.displayCompany(); // Static method call

		e2.name = "Rahul";
		e2.salary = 60000;
		e2.displayEmp();

	}

}

class Employee
{
	String name;
	int salary;

	static String companyName = "Kodewala";

	void displayEmp()
	{
		System.out.println("Employee.displayEmp()... Instance");
		System.out.println(name);
		System.out.println(salary);
		System.out.println(companyName);
	}

	static void displayCompany()
	{
		System.out.println("Employee.displayCompany()... Static");
		System.out.println(companyName);
	}

}
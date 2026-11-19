package pdfKodewala.nonPrimitiveDT;

public class NonPrimitiveDataTypes
	{
		public static void main(String[] args)
			{
				System.out.println("NonPrimitiveDataTypes.main()");
				
				String name = "Kodewala"; // This is NP Data Type
				System.out.println(name);
				
				String test;
//				System.out.println(test); // Compile-time error
				
				Employee emp1 = new Employee();
				System.out.println(emp1.name);
				System.out.println(emp1.manager);
			}
	}

class Account
	{
		public static void doSomething()
			{
				Account account = new Account(); // This is non primitive data type
			}
	}

class Employee
	{
		String name ;
		Employee manager;
	}
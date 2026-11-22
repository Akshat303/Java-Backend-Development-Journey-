package pdfKodewala.nonPrimitiveDT;

/**
 * name instance variable hai, isliye default value null mili. city local
 * variable hai, isliye usko initialize karna mandatory hai. name object ke
 * saath associated hai. city sirf display() method ke scope mein available hai.
 */

public class Demo2
{

	public static void main(String[] args)
	{
		Student2 s = new Student2();
		// s.name="ak";
		s.display();

	}

}

class Student2
{

	String name; // Instance variable

	void display()
	{

		String city; // Local variable

		// System.out.println(city); // Compile-time error

		System.out.println(name);
	}
}

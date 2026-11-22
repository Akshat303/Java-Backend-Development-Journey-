package pdfKodewala.JavaMethod;

public class Demo
{

	public static void main(String[] args)
	{
		Test.display();

	}

}

class Test
{
	static int x = 233;
	int y = 423;

	static void display()
	{
		System.out.println(x);

		// System.out.println(y); // Non-static variable x cannot be referenced from a
		// static context

		Test d = new Test(); // create object and the use instance variable

		System.out.println(d.y);

		// Static method cannot use this --> Compile-time error.
		// this current object ko refer karta hai.
		// But static method kisi particular object ke saath associated nahi hota.
	}
}
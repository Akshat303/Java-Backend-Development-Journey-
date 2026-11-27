package code.nestedClasses;

public class LocalClasses
{

	public static void main(String[] args)
	{
		Outer4 out = new Outer4();
		out.greet();
	}

}

class Outer4
{
	public String y = "Akshat";

	void greet()
	{
		int x = 32;
		// System.out.println("Outer4.greet().... Hello");
		class Local
		{
			int z = 5;

			void sayHello()
			{
				System.out.println("Outer4.greet().Local.sayHello().... Hello2");
				System.out.println("x = " + x);
				System.out.println("y = " + y );
				System.out.println("z = " + z );
			}
		}

		Local loc = new Local();
		loc.sayHello();

	}
}
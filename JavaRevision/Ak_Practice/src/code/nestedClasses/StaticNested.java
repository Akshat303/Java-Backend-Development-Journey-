package code.nestedClasses;

public class StaticNested
{

	public static void main(String[] args)
	{

		Outer.Inner oi = new Outer.Inner();
		oi.printName();
		Outer.Inner.printName2();

		Outer outer = new Outer();
		Outer.Inner inner = new Outer.Inner();

		inner.fun(outer);

	}

}

class Outer
{
	static int x = 12;
	int y = 23;

	static class Inner
	{
		void printName()
		{
			System.out.println("Outer.Inner.printName()");
			System.out.println("outer static variable x " + x);
			// System.out.println("outer static variable y " + y);

		}

		void fun(Outer outer)
		{
			System.out.println("Outer.Inner.fun()");
			System.out.println("outer static variable x " + x);
			System.out.println("outer static variable y " + outer.y);
		}

		static void printName2()
		{
			System.out.println("Outer.Inner.printName2()");
		}
	}
}

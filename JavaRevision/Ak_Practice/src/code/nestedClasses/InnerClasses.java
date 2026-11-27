package code.nestedClasses;

public class InnerClasses
{
	public static void main(String[] args)
	{

		Outer3 outer3 = new Outer3();
		Outer3.Inner inner = outer3.new Inner();
		inner.display();

//		inner.fun3(); // Static method call direct with className.
		Outer3.Inner.fun3(); // Static method call direct with className.

	}
}

class Outer3
{
	int x = 12;

	class Inner
	{
		int x = 32;

		void display()
		{
			System.out.println("Inner " + x); // 32 (Inner class ka x)
			// Agar Outer3 ka x print karna ho: System.out.print(Outer3.this.x);

			System.out.println("Outer3 " + Outer3.this.x);
		}

		static void fun3()  // Before Java 16, static methods were not allowed in inner classes
		{
			System.out.println("Static --> Hello");
		}
	}
}
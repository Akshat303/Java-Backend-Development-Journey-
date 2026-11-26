package code.nestedClasses;

public class InnerClass
{

	public static void main(String[] args)
	{
		Outer2 outer = new Outer2();
		Outer2.Inner2 inn = outer.new Inner2();
		inn.fun();

	}

}

class Outer2
{
	class Inner2
	{
		void fun() {
			System.out.println("Outer2.Inner2.fun()");
		}
	}
}

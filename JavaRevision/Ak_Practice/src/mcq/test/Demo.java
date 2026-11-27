package mcq.test;

public class Demo
{
	int v;

	static void change(Demo e)
	{
		e.v = 10;
		// System.out.println(e.v);
		e = new Demo();
		e.v = 20;
		// System.out.println(e.v);
	}

	public static void main(String[] args)
	{
		Demo x = new Demo();
		x.v = 5;
		change(x);
		System.out.println(x.v);
	}
}
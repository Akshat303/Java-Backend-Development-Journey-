package code.autoboxing;

/*
 * When Automatic autoboxing and unboxing
 * Method  call 
 * Assignments
 * Arithmetic
 */

public class AutoboxingUnboxing
{

	public static void main(String[] args)
	{

		// AutoBoxing
		int x = 10;
		Integer y = x; // autoboxing

		System.out.println(x);
		System.out.println(y); // unboxing

		// UnBoxing
		// Integer a = new Integer(20);// old java before 9
		// Integer a = Integer.valueOf(20);// new
		Integer a = 20;// autoboxing
		int b = a;// unboxing
		System.out.println(a);
		System.out.println(b);

		int num1 = 177;
		int num2 = 177;
		System.out.println(num1 == num2); // true

		Integer num3 = 34;
		Integer num4 = 34;
		System.out.println(num3 == num4); // true

		Integer num5 = 177;
		Integer num6 = 177;
		System.out.println(num5 == num6); // false (creates two distinct Integer objects)
		System.out.println(num5.equals(num6));
	}

}

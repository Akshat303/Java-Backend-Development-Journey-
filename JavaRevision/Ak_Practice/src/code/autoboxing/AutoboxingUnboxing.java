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

		int num1 = 177; // no obj
		int num2 = 177;
		System.out.println(num1 == num2); // t

		Integer num3 = 122;
		Integer num4 = 122;
		System.out.println(num3 == num4); // {range -128 to 127}

		Integer num5 = 133;
		Integer num6 = 133;
		System.out.println(num5 == num6); // (creates two distinct Integer objects)

		System.out.println(num5.equals(num6)); //

		// Double
		System.out.println("AutoboxingUnboxing.main()");
		Double dnum3 = 122.0;
		Double dnum4 = 122.0;

		System.out.println(dnum3 == dnum4); // false (creates two distinct Double objects)

		Double dnum5 = 133.0;
		Double dnum6 = 133.0;

		System.out.println(dnum5 == dnum6); // false (creates two distinct Double objects)

		System.out.println(dnum5.equals(dnum6)); // true (compares values)

	}

}

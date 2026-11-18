package com.day44_exceptionHandling;

public class Driver1
	{

		public static void main(String[] args)
			{
				System.out.println("Driver1.main()...Start");

				Driver1 driver = new Driver1();
				driver.doSomething();

				System.out.println("Driver1.main()..End");
			}

		public void doSomething()
			{

				System.out.println("Driver1.doSomething()...Start");

				String name = null;

				try
					{
						System.out.println(name.length());
					}
				// catch (NullPointerException e) {
				//
				// System.err.println("Name is null... enter valid name");
				// e.printStackTrace();
				// }
				catch (Exception e)
					{
						System.err.println("Exception block { }...Wrong Input... Write valid input");
						e.printStackTrace();
					}
				
				System.out.println("Driver1.doSomething()...End");

			}
	}
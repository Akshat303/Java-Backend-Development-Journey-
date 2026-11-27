package code.nestedClasses;

// AnonymousClass --> Class without name 
public class AnonymousClass
{

	public static void main(String[] args)
	{
		Person p1 = new Person();
		p1.intro();

		// AnonymousClass
		Person p2 = new Person()
		{
			@Override
			void intro()
			{
				name();
				System.out.println("AnonymousClass.main(...).new Person() {...}.intro() .. Hi Guest .. ");
			}

			void name()
			{
				System.out.println("Akshat");
			}
		};
		p2.intro();
		// p2.name(); no dircet call

	}

}

class Person
{
	void intro()
	{
		System.out.println("Person.intro()... Hello");
	}
}
package code.staticFinal;

public class StaticFinalPractice 
{

	public static void main(String[] args) 
	{
		Student s1 = new Student("Akshat", 25, 12);
		Student s2 = new Student("Aman", 29, 32);

		Student.collage = "ISM";
		s1.dispaly();
		s2.dispaly();
		
		final int n;
		n = 23; // First time assign is valid 
//		n=2; not valid 
		System.out.println("Test " + n);
	}

}

class Student 
{
	String name;
	int age;
	int rollNo;
	static String collage;
	static String collageAddress;

	final String PIN_CODE = "826001"; // not change, always uppercase
	final int COLLAGE_YEAR;
	static final String BRANCH_Name;

	public Student(String name, int age, int rollNo) 
	{
		super();
		this.name = name;
		this.age = age;
		this.rollNo = rollNo;
		this.COLLAGE_YEAR = 1926;
	}

	// Static block;
	static 
	{
		collageAddress = "Dhanbad";
		BRANCH_Name = "CSE";
	}

	void dispaly() 
	{
		System.out.println
			(
				"Name- " + name + 
				", Age- " + age + 
				", Roll No.- " + rollNo + 
				", Collage- " + collage +
				", Address- " + collageAddress + 
				", Pin code- " + PIN_CODE + 
				", Year- " + COLLAGE_YEAR +
				", Branch- " + BRANCH_Name 
			);
	}

}
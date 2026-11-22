package pdfKodewala.JavaVariables;

public class IVDefaultValue
{

	public static void main(String[] args)
	{
		Student e = new Student();

		// The default values shown here are Java language defaults for instance fields.

		System.out.println(e.roll); // 0
		System.out.println(e.name); // null
		System.out.println(e.active); // false
		System.out.println(e.schoolName); // null
		System.out.println(e.fee); // 0.0

	}

}

class Student
{
	int roll;
	String name;
	boolean active;
	String schoolName;
	double fee;
}
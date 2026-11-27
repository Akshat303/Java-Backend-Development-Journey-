package pdfKodewala.JavaMethod;

public class InstanceMethods
{

	public static void main(String[] args)
	{

		Student st1 = new Student();
		st1.study();

		int roll = st1.rollNo();
		System.out.println(roll);

	}

}

class Student
{
	void study()
	{
		System.out.println("Student.study().... Student is studying");
	}

	int rollNo()
	{
		return 12;
	}
}
package learn.JVMRuntimeMemoryAreas;

/*
 * What are  JVM RunTime Memory Areas ?
 * Jab hum Java program execute karte hain, toh JVM ko program run karne ke liye memory ki zaroorat hoti hai.
 */

/*
 * Is program ko execute karte waqt JVM ko kuch information store karni padti hai:
- Student class ki information.
- main() method ki information.
- age variable ki value.
- student reference.
- Actual Student object.
- Object ke andar name field ki value.
- Method execute karne ke liye temporary data.
 */

public class Main1
{

	public static void main(String[] args)
	{
		int age = 23;
		Student st = new Student();

	}

}

class Student
{
	String name = "Akshat";
}
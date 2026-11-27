package pdfKodewala.encapsulation1;

public class Student {

	private int age; // private data member

	public int getAge() // Getter
	{
		return age;
	}

	public void setAge(int age) // Setter
	{
		if (age >= 1 && age <= 100) {
			this.age = age;
		} else {
			System.out.println("Invalid age");
		}
	}
}

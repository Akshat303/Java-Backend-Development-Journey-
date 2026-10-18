package code.encapsulation_inheritance;

public class Demo2 {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setName("Akshat");
		System.out.println(s1.getName());

	}

}

class Student {
	private String name;
	private int rollNo;
	private int age;
	private String collage;

	Student(String name, int rollNo, int age, String collage) {
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
		this.collage = collage;
	}

	Student() {
		this("null", 0, 0, "null");
	}

	// getter

	String getName() {
		return name;
	}

	// Setter
	String setName(String name) {
		return this.name = name;

	}

}
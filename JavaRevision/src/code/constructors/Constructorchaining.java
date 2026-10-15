package code.constructors;

public class Constructorchaining {

	public static void main(String[] args) {
		MyStudent st1 = new MyStudent();
//		MyStudent st2 = new MyStudent("Ak", 23);
//		MyStudent st3 = new MyStudent("Mk", 43, 6, "Btm");
//		MyStudent st4 = new MyStudent("Mk", 4, 99);
//		MyStudent st5 = new MyStudent("Mk");

		// Display
		st1.display();
//		st2.display();
//		st3.display();
//		st4.display();
//		st5.display();

	}

}

class MyStudent {
	String name;
	int age;
	int rollNo;
	String address;

	public MyStudent() {

		this("No name", 0);
		System.out.println("1");

	}

	public MyStudent(String name) {

		this(name, 0, 0, "no");
		System.out.println("2");

	}

	// Constructor with name and age (constructor chaining)
	MyStudent(String name, int age) {

		this(name, age, 0);
		System.out.println("3");
	}

	// Constructor with name, age and rollNo (constructor chaining)
	MyStudent(String name, int age, int rollNo) {

		this(name, age, rollNo, "Not Assigned");
		System.out.println("4");
	}

	MyStudent(String name, int age, int rollNo, String address) {

		this.name = name;
		this.age = age;
		this.rollNo = rollNo;
		this.address = address;
		System.out.println("5");
	}

	void display() {
		System.out.println("Name: " + name + ", Age: " + age + ", Roll Number: " + rollNo + ", Address: " + address);
	}

}

package code.constructors;

public class DemoConstructors {

	public static void main(String[] args) {

		int x; // local variable {scope main{} // store in stack // No default value

		x = 56;
		System.out.println(x);

		// Object
		Student s1 = new Student();
		s1.name = "Akshat";
		s1.age = 26;
		System.out.println(s1.address); // null {Default value
		s1.address = "BTM";
		System.out.println(s1.address);
		s1.doSomething();

// Constructors --> To create an object

	}

}

//Class
class Student {
	// information, data, characteristics -> instance variable // Store in Heap
	// {default value}

	String name;
	int age;
	int rollNo;
	String address;

	// Behaviours --> function --> instance method
	void doSomething() {
		System.out.println("My name is - " + name);
	}
}
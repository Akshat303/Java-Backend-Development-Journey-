package code.constructors;

public class DemoConstructors2 {

	public static void main(String[] args) {

		StudentClass s1 = new StudentClass("Amit", 24, 12, "Btm");
		s1.displyOutput();

		System.out.println("Student2");
		StudentClass s2 = new StudentClass();
		s1.displyOutput();

	}

}

class StudentClass {
	String name = "Aks";
	int age = 23;
	int rollNo = 2;
	String address = "Dhn";

// Default constructor
	StudentClass() {

	}

//	parameterized constructor
//	StudentClass() {
//		name = "Akshat";
//		age = 23;
//		rollNo = 12;
//		address = "BTM";
//	}

//	parameterized constructor
	StudentClass(String name, int age, int _rollNo, String _address) {
		this.name = name;
		age = age; // 0 because age age is same and not use this
		rollNo = _rollNo;
		address = _address;
	}

	void doSoething() {
		System.out.println("Im am doSomething()" + name);
	}

	void displyOutput() {

		System.out.println(name);
		System.out.println(age);
		System.out.println(rollNo);
		System.out.println(address);
	}

}

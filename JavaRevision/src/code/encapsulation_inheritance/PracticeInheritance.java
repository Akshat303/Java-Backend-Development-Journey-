package code.encapsulation_inheritance;

public class PracticeInheritance {
	public static void main(String[] args) {

		EngineeringStudent es = new EngineeringStudent();

		es.markAttendance();
		es.attendLab();
	}
}

class Student2 {
	String name;
	int age;

	void markAttendance() {
		System.out.println("Attendance marked");
	}
}

class EngineeringStudent extends Student2 {

	void attendLab() {
		System.out.println("Lab attended");
	}
}
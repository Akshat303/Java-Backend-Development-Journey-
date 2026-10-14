package code.oops;

public class ClassObject {

	public static void main(String[] args) {

		// Object of student class
		Student s1 = new Student();
		s1.name = "Akshat";
		s1.age = 26;
		s1.rollNo = 121;
		s1.collage = "Kodewala";

		s1.marksAttendance();
		s1.dispaly();

	}

}

// Class of student
class Student {
	String name;
	int age;
	int rollNo;
	String collage;

	void marksAttendance() {
		System.out.println("Marks by " + name);
	}

	void dispaly() {
		System.out.println("Name " + name + " Age " + age + " Roll no " + rollNo + " collage " + collage);
	}

}
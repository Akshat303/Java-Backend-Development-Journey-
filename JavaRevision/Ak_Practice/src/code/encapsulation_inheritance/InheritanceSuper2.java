package code.encapsulation_inheritance;

public class InheritanceSuper2 {

	public static void main(String[] args) {

		EngineeringStudent2 es1 = new EngineeringStudent2("ism", 210, "dhan", "ak");
		es1.print();
	}

}

class NewStudent {
	String collageName;
	int openYear = 255;
	String collageAddress;

	public NewStudent(String collageName, int openYear, String collageAddress) {

		this.collageName = collageName;
		this.collageAddress = collageAddress;
	}

}

class EngineeringStudent2 extends NewStudent {

	String stname;
	int openYear;

	public EngineeringStudent2(String collageName, int openYear, String collageAddress, String stname) {

		super(collageName, openYear, collageAddress);
		this.stname = stname;
		this.openYear = openYear;
	}

	void print() {
		System.out.println(collageName);
		System.out.println(super.openYear);
		System.out.println(openYear);
		System.out.println(collageAddress);
		System.out.println(stname);

	}

}

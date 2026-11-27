package code.classObject;

//call by reference --> there is no call by reference in java

public class CallByReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r1 = new Random(3, 4);
		System.out.println(r1.x + ", " + r1.y);
		
		Random r2 = new Random(r1); // Deep Copy
		System.out.println(r2.x + ", " + r2.y);
		
		Random r3 = r1; // Shallow copy b/c not create new object
		System.out.println(r3.x + ", " + r3.y);
		
		

		addTen(r1);
		System.out.println(r1.x + ", " + r1.y);

	}

	static void addTen(Random r) {
		r.x = r.x + 10;
		r.y = r.y + 10;
	}

}

class Random {
	int x;
	int y;

	public Random(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	Random(Random r) {
		this.x = r.x;
		this.y = r.y;
	}

}

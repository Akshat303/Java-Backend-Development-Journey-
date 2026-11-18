// Local variable

class Demo {

    static void show() {

        int age = 25;
		System.out.println("Local variable");
        System.out.println(age);
    }

    public static void main(String[] args) {
        show();
    }
}

//Static variable

class Student {
	static  String coll = "Abc";
	String name ;
	
	Student(String _name){
		this.name = _name;
	}
	
	public static void main(String[] args){
		System.out.println("Static variable");
		Student st = new Student("Akshat" );
		System.out.println("Static Collage = " + st.coll +" Name = "  + st.name);
	}
}


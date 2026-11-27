package practice.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serialization {

	public static void main(String[] args) throws IOException {

		// Create object of student class

		Student st1 = new Student("Akshat", "ak@gmail.com", 26, "BTM phase-1 Bangalore");
		
		
		//Write data to file
		FileOutputStream fos = new FileOutputStream("ob.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		//How to serialize
		oos.writeObject(st1);
		
		oos.close();
		fos.close();
		System.out.println("object state is transfered to file ob.txt file ....");
		
	}

}

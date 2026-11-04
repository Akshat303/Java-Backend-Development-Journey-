package practice.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("A:\\Java-Backend-Development-Journey-\\JavaRevision\\ob.txt");
//		FileInputStream fis = new FileInputStream("ob.txt");

		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student stInfo = (Student)ois.readObject();
		stInfo.displayname();
	}

}

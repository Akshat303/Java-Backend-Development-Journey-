package pdf.collection;

/*
 Before JDK 1.2, Java mein objects group karne ke liye mainly:
- Array
- Vector
- Hashtable
 */

import java.util.HashMap;
import java.util.Vector;

public class HashtableVector
{

	public static void main(String[] args)
	{

		// creating instances of the array, vector, and hashtable

		int arr[] = new int[] { 1, 2, 3, 4 };
		System.out.println(arr[0]);

		Vector<Integer> v = new Vector<Integer>();

		HashMap<Integer, String> h = new HashMap<Integer, String>();

		// Adding element into the vector
		v.add(1);
		v.add(2);
		System.out.println(v);

		// Adding element into the Hashtable
		h.put(1, "Kodewala");
		h.put(2, "Academy");
		System.out.println(h.get(1));
		System.out.println(h.get(2));

	}

}

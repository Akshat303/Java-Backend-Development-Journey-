package pdf.collection;

/*
Collection						Collections
Interface	    				Utility class
Part of collection hierarchy	Provides utility methods
java.util.Collection			java.util.Collections
add(), remove(), size()			sort(), reverse(), shuffle()
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionVsCollections
{

	public static void main(String[] args)
	{

		Collection<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Banana");

		System.out.println(fruits);
		System.out.println(fruits.size());
		System.out.println(fruits.contains("Mango"));

		fruits.remove("Banana");
		System.out.println(fruits);

		List<Integer> num = new ArrayList<>();
		num.add(2);
		num.add(21);
		num.add(12);
		num.add(42);
		num.add(02);

		System.out.println(num);
		Collections.sort(num);
		System.out.println(num);

		Collections.reverse(num);
		System.out.println(num);

		Collections.shuffle(num);

		System.out.println(num);
	}

}

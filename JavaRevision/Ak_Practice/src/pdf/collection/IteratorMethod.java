package pdf.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorMethod
{

	public static void main(String[] args)
	{

		List<String> names = new ArrayList<String>();

		names.add("Akshat");
		names.add("Amit");
		names.add("Rahul");
		names.add("Ravi");

		Iterator<String> itr = names.iterator();

		/*
		 * hasNext() Checks whether next element exists, next() Returns the next
		 * element, remove() Removes the last returned element, if supported
		 */

		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}

		// For Each Loop

		for (String name : names)
		{
			System.out.println("Use ForEach -> " + name);
		}

		// Shorthand literal (only when declaring on the same line)
		int[] scores = { 90, 85, 95, 80 };

		for (int score : scores)
		{
			System.out.println(score);
		}

		// Explicit 'new' literal (can be passed directly to methods or reassigned
		// later)
		// int[] moreScores = new int[]{10, 20, 30};

	}

}

package pdf.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Driver
{

	public static void main(String[] args)
	{

		ArrayList<String> stName = new ArrayList<String>();

		stName.add("Akshat");
		stName.add("Amit");
		stName.add("Abhi");
		stName.add(null);
		stName.add("Priya");
		stName.add("Priti");
		stName.add(null);
		stName.add("Abhi");
		stName.add("Akshat");
		stName.add("Abhi");

		System.out.println(stName);

		/*
		 * Flexibility: If you later decide LinkedList fits a workload better, changing
		 * new ArrayList<>() to new LinkedList<>() doesn't break callers expecting a
		 * List.
		 */

		List<String> names = new ArrayList<>();
		names.add("Rakesh");
		System.out.println(names);

		LinkedList<String> empName = new LinkedList<>();
		empName.add("Sonu");
		empName.add("Abhi");
		empName.add("Sonu");
		System.out.println(empName);

		/*
		 * List (ArrayList, LinkedList) → Duplicate ✅ 
		 * Set (HashSet, LinkedHashSet,
		 * TreeSet) → Duplicate ❌
		 * Map → Duplicate Key ❌, Duplicate Value ✅
		 */

		
		Set<String> empName2 = new HashSet<>();

		empName2.add("Sonu");
		empName2.add("Abhi");
		empName2.add("Sonu");

		System.out.println(empName2);
	}

}

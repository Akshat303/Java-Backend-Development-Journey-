package pdfKodewala.nonPrimitiveDT;

import java.util.Arrays;

public class Practice
	{

		public static void main(String[] args)
			{
				Student s1 = new Student();

				// s1.name = "Akshat";
				// s1.marks = new int[] { 85, 90, 95 };

				System.out.println("Name: " + s1.name);
				System.out.println("Marks: " + s1.marks);
				
				// System.out.println("Marks: " + Arrays.toString(s1.marks));

				if (s1.name == null)
					{
						System.out.println("Name is null");
					}

				if (s1.marks == null)
					{
						System.out.println("Marks array is null");
					}
			}

	}

class Student
	{
		String name;
		int[] marks;
	}

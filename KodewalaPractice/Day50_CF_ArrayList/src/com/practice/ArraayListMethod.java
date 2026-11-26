package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraayListMethod
{

	public static void main(String[] args)
	{

		// =========================
		// of()
		// =========================

		// List.of() immutable list banata hai
		List<String> fixedStudents = List.of("Akshat", "Rahul", "Aman", "Rahul");

		// ArrayList banaya taaki modify kar sake
		ArrayList<String> students = new ArrayList<>(fixedStudents);

		System.out.println("Original List : " + students);

		// =========================
		// contains()
		// =========================

		System.out.println("\ncontains()");
		System.out.println("Contains Rahul ? " + students.contains("Rahul"));

		// =========================
		// indexOf()
		// =========================

		System.out.println("\nindexOf()");
		System.out.println("First Rahul Index : " + students.indexOf("Rahul"));

		// =========================
		// lastIndexOf()
		// =========================

		System.out.println("\nlastIndexOf()");
		System.out.println("Last Rahul Index : " + students.lastIndexOf("Rahul"));

		// =========================
		// set()
		// =========================

		// Aman ko Priya se replace kar diya
		students.set(2, "Priya");

		System.out.println("\n set()");
		System.out.println("After Update : " + students);

		// =========================
		// isEmpty()
		// =========================

		System.out.println("\nisEmpty()");
		System.out.println("Is Empty ? " + students.isEmpty());

		// =========================
		// addAll()
		// =========================

		ArrayList<String> newStudents = new ArrayList<>();

		newStudents.add("Neha");
		newStudents.add("Rohit");

		students.addAll(newStudents);

		System.out.println("\naddAll()");
		System.out.println("After Merge : " + students);

		// =========================
		// sort()
		// =========================

		Collections.sort(students);

		System.out.println("\nsort()");
		System.out.println("Sorted List : " + students);

		// =========================
		// subList()
		// =========================

		System.out.println("\nsubList()");
		System.out.println("Top 3 Students : " + students.subList(0, 3));

		// =========================
		// removeAll()
		// =========================

		ArrayList<String> removeList = new ArrayList<>();

		removeList.add("Rahul");
		removeList.add("Neha");

		students.removeAll(removeList);

		System.out.println("\nremoveAll()");
		System.out.println("After Remove : " + students);

		// =========================
		// retainAll()
		// =========================

		ArrayList<String> topperList = new ArrayList<>();

		topperList.add("Akshat");
		topperList.add("Priya");

		students.retainAll(topperList);

		System.out.println("\nretainAll()");
		System.out.println("Common Students : " + students);

		// =========================
		// clear()
		// =========================

		students.clear();

		System.out.println("\nclear()");
		System.out.println("After Clear : " + students);

		System.out.println("Is Empty Now ? " + students.isEmpty());
	}
}

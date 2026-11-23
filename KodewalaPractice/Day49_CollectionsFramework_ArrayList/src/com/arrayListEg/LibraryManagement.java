package com.arrayListEg;

import java.util.ArrayList;

class LibraryService
{

	// Stores all books
	private ArrayList<String> books = new ArrayList<>();

	// Add a book
	public void addBook(String bookName)
	{
		books.add(bookName);
	}

	// Display all books
	public void displayBooks()
	{
		System.out.println("Books: " + books);
	}

	// Display total books
	public void displayTotalBooks()
	{
		System.out.println("Total Books: " + books.size());
	}

	// Check if a book exists
	public void checkBook(String bookName)
	{

		if (books.contains(bookName))
		{
			System.out.println(bookName + " Found");
		}
		else
		{
			System.out.println(bookName + " Not Found");
		}
	}

	// Update a book
	public void updateBook(int index, String newBookName)
	{
		books.set(index, newBookName);
	}

	// Remove a book
	public void removeBook(int index)
	{
		books.remove(index);
	}

	// Print first and last book
	public void displayFirstAndLastBook()
	{

		if (!books.isEmpty())
		{

			System.out.println("First Book: " + books.get(0));
			System.out.println("Last Book: " + books.get(books.size() - 1));

		}
		else
		{
			System.out.println("No Books Available");
		}
	}

	// Clear all books
	public void clearLibrary()
	{
		books.clear();
	}

	// Check library is empty or not
	public void checkLibraryEmpty()
	{
		System.out.println("Library Empty: " + books.isEmpty());
	}
}

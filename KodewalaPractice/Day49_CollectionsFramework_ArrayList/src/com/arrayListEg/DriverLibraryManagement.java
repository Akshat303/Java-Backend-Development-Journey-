package com.arrayListEg;

public class DriverLibraryManagement
{

	public static void main(String[] args)
	{

		LibraryService library = new LibraryService();

		// Step 1 & Step 2: Add Books
		library.addBook("Java Basics");
		library.addBook("Python Basics");
		library.addBook("Spring Boot");
		library.addBook("Data Structures");
		library.addBook("Java Basics"); // duplicate allowed

		System.out.println("===== ALL BOOKS =====");
		library.displayBooks();

		// Step 3: Total Books
		System.out.println("\n===== TOTAL BOOKS =====");
		library.displayTotalBooks();

		// Step 4: Contains
		System.out.println("\n===== SEARCH BOOK =====");
		library.checkBook("Spring Boot");

		// Step 5: Update
		System.out.println("\n===== UPDATE BOOK =====");
		library.updateBook(1, "Python Programming");
		library.displayBooks();

		// Step 6: Remove
		System.out.println("\n===== REMOVE BOOK =====");
		library.removeBook(3);
		library.displayBooks();

		// Step 7: First & Last Book
		System.out.println("\n===== FIRST & LAST BOOK =====");
		library.displayFirstAndLastBook();

		// Step 8: Final List
		System.out.println("\n===== FINAL LIST =====");
		library.displayBooks();

		// Step 9: Clear Library
		System.out.println("\n===== CLEAR LIBRARY =====");
		library.clearLibrary();
		library.displayBooks();

		// Step 10: Check Empty
		System.out.println("\n===== CHECK EMPTY =====");
		library.checkLibraryEmpty();
	}

}

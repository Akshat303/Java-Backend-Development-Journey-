package com.constructor.practice;

public class DriverProduct {

	public static void main(String[] args) {

		GameProduct gameProductInfo = new GameProduct("GTA V", 140699.00, "GTA101", "Video Game",
				"Open-world action game", 25, 4.3, true, "Action", "PC");

//		Default all product attribute call sysoDefault() for print
		gameProductInfo.sysoDefault();
		
//		specific  product attribute call displayGame() for print 
		gameProductInfo.displayGame();
		
		System.out.println("\n ******** Book product ********  \n");
		/**
		 * BookProduct
		 */
		BookProduct javaProgrammingBook = new BookProduct(
			    "Head First Java",                    // name
			    899.00,                               // price
			    "BOOK-JAVA-001",                     // sku
			    "Book",                               // productType
			    "Beginner friendly Java programming book", // description
			    25,                                   // stock
			    4.7,                                  // rating
			    true,                                 // available
			    "Kathy Sierra",                       // author
			    "O'Reilly Media",                     // publisher
			    "978-0596009205",                     // isbn
			    "English",                            // language
			    688,                                  // pages
			    "2nd Edition",                        // edition
			    "2005-02-18",                         // publicationDate
			    "Programming",                        // genre
			    "Paperback",                          // format
			    "Technical"                           // bookType
			);
//		Default all product attribute call sysoDefault() for print
		javaProgrammingBook.sysoDefault();
		
//		specific  product attribute call displayBook() for print 
		javaProgrammingBook.displayBook();
	
		System.out.println("\n ******** Fiction Book ********  \n");
		 BookProduct fictionBook = new BookProduct(
		    "The Alchemist",                      // name
		    399.00,                               // price
		    "BOOK-FIC-002",                       // sku
		    "Book",                               // productType
		    "A philosophical fiction novel",     // description
		    40,                                   // stock
		    4.6,                                  // rating
		    true,                                 // available

		    "Paulo Coelho",                       // author
		    "HarperCollins",                      // publisher
		    "978-0062315007",                     // isbn
		    "English",                            // language
		    208,                                  // pages
		    "25th Anniversary Edition",           // edition
		    "2014-04-15",                         // publicationDate
		    "Fiction",                            // genre
		    "Paperback",                          // format
		    "Novel"                               // bookType
		);
//			Default all product attribute call sysoDefault() for print
		 fictionBook.sysoDefault();
			
//			specific  product attribute call displayBook() for print 
		 fictionBook.displayBook();
		 
		 //Default argument 
		 System.out.println("\n ******** Default Argument ********  \n");
		 ProductDefaultWithoutArgu withoutArgu = new ProductDefaultWithoutArgu();
		 withoutArgu.sysoDefault();
		 
		 //Default argument with Argument
		 System.out.println("\n ******** Default argument with Argument ********  \n");
		 ProductDefaultArguWithArgu defaultArguWithArgu = new ProductDefaultArguWithArgu(
				    "James Clear",             // author
				    "Avery",                   // publisher
				    "978-0735211292",          // isbn
				    "English",                 // language
				    320,                       // pages
				    "1st Edition",             // edition
				    "2018-10-16",              // publicationDate
				    "Self-Help",               // genre
				    "Hardcover",               // format
				    "Non-Fiction"              // bookType
				 );
		 defaultArguWithArgu.sysoDefault();
		 defaultArguWithArgu.displayWithArgu();
		 
	}
}

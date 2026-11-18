package com.constructor.practice;

public class ProductDefaultArguWithArgu extends Product {

	String author;
	String publisher;
	String isbn;
	String language;
	int pages;
	String edition;
	String publicationDate;
	String genre;
	String format;
	String bookType;

	public ProductDefaultArguWithArgu(			
			String _author,
			String _publisher,
			String _isbn,
			String _language,
			int _pages,
			String _edition,
			String _publicationDate,
			String _genre,
			String _format, 
			String _bookType) {

        super();  // Product ka default constructor

		this.author =_author;
		this.publisher =_publisher;
		this.isbn =_isbn;
		this.language =_language;
		this.pages = _pages;
		this.edition=_edition;
		this.publicationDate=_publicationDate;
		this.genre=_genre;
		this.format=_format; 
		this.bookType= _bookType;
    }
	void displayWithArgu() {
		System.out.println("Author : " + author);
		System.out.println("Publisher : " + publisher);
		System.out.println("Isbn : " + isbn);
		System.out.println("Language : " + language);
		System.out.println("Pages : " + pages);
		System.out.println("Edition : " + edition);
		System.out.println("PublicationDate : " + publicationDate);
		System.out.println("Genre : " + genre);
		System.out.println("Format : " + format);
		System.out.println("BookType : " + bookType);
	}
}
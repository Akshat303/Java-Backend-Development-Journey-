package com.constructor.practice;

public class BookProduct extends Product {

	String author;
	String publisher;
	String isbn;
	String language;
	int pages;
	String edition;
	String publicationDate;
	String genre;
	String format; // Paperback/Hardcover
	String bookType;

	/**
	 * @param _name
	 * @param _price
	 * @param _sku
	 * @param _productType
	 * @param _description
	 * @param _stock
	 * @param _rating
	 * @param _available
	 */
	public BookProduct(
			String _name, 
			double _price, 
			String _sku, 
			String _productType, 
			String _description, 
			int _stock,
			double _rating, 
			boolean _available,
			
			String _author,
			String _publisher,
			String _isbn,
			String _language,
			int _pages,
			String _edition,
			String _publicationDate,
			String _genre,
			String _format, // Paperback/Hardcover
			String _bookType) 
			{
				super(_name, _price, _sku, _productType, _description, _stock, _rating, _available);
		// TODO Auto-generated constructor stub
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
	void displayBook() {
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

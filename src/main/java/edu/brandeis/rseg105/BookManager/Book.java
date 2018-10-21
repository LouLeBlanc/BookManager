package edu.brandeis.rseg105.books_di.BookManager;

public class Book {
	private long id;
	private String isbn;
	private String title;
	double price;

	/**
	 * Create a default book object
	 */
	public Book() { }
	/**
	 * Create a book with the specified values
	 * @param id the id to set
	 * @param isbn the isbn to set
	 * @param title the title to set
	 * @param price the price to set
	 */
	public Book(int id, String isbn, String title, double price) {
		this.id = id;
		this.isbn = isbn;
		this.title = title;
		this.price = price;
	}

	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}
	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Id: " + this.id + ", ISBN: " + this.isbn + ", Title: " + this.title + ", Price: " + this.price;
	}
}

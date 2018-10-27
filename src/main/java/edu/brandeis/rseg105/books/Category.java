package edu.brandeis.rseg105.books;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Category {
	private long id;
	private String name;
	private Set<Book> bookSet;
	private List<Book> booksList;
	private Map<String, Book> booksMap;

	/**
	 * Create a default category object
	 */
	public Category() {}
	/**
	 * Create a Category with id and name.
	 * @param id the id to set
	 * @param name the name to set
	 */
	public Category(long id, String name) {
		this.setId(id);
		this.setName(name);
	}
	/**
	 * @return id
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the bookSet
	 */
	public Set<Book> getBookSet() {
		return bookSet;
	}
	/**
	 * @return the booksList
	 */
	public List<Book> getBooksList() {
		return booksList;
	}
	/**
	 * @return the booksMap
	 */
	public Map<String, Book> getBooksMap() {
		return booksMap;
	}
	/**
	 * Add a book to the bookSet
	 * @param book the book to add
	 * @return true on success
	 */
	public boolean addBookToSet(Book book) {
		return this.bookSet.add(book);
	}
	/**
	 * Add a book to the booksList
	 * @param book the book to add
	 * @return true on success
	 */
	public boolean addBookToList(Book book) {
		return this.booksList.add(book);
	}
	/**
	 * Add a key and book to the booksMap
	 * @param key the key to add
	 * @param book the book to add
	 * @return	the previous value associated with key,
	 *			or null if there was no mapping for key
	 */
	public Book addBookToMap(String key, Book book) {
		return this.booksMap.put(key, book);
	}

	@Override
	public String toString() {
		StringBuilder collectionString = new StringBuilder();

		if (!this.bookSet.isEmpty()) {

			collectionString.append("Category -- Id: " + this.id + ", Name: " + this.name + ", Books Set: [");
			this.bookSet.forEach((book) -> {
				collectionString.append(book.toString());
				collectionString.append(", ");
			});
			collectionString.delete(collectionString.length()-3, collectionString.length());
			collectionString.append("]");

		} else if (!this.booksList.isEmpty()) {

			collectionString.append("Category -- Id: " + this.id + ", Name: " + this.name + ", Books List: [");
			this.booksList.forEach((book) -> {
				collectionString.append(book.toString());
				collectionString.append(", ");
			});
			collectionString.delete(collectionString.length()-3, collectionString.length());
			collectionString.append("]");

		} else if (!this.booksMap.isEmpty()) {

			collectionString.append("Category -- Id: " + this.id + ", Name: " + this.name + ", Books Map: <");
			this.booksMap.forEach((s, book) -> {
				collectionString.append("Key" + s + "=");
				collectionString.append(book.toString());
				collectionString.append(", ");
			});
			collectionString.delete(collectionString.length()-3, collectionString.length());
			collectionString.append(">");

		}
		return collectionString.toString();
	}
}

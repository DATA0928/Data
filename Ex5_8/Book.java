package Ex5_8;

public class Book {
	private String title;
	private double price;
	private int yearpublication;
	private Author author;

	public Book(String title, double price, int yearOfPublication, Author author) {

		this.title = title;
		this.price = price;
		this.yearOfPublication = yearOfPublication;
		this.author = author;
	}

	public boolean isTitleBefore(Book that) {
		return this.title.compareTo(that.title) < 0;
	}
}

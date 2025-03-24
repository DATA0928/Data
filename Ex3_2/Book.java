package Ex3_2;

public class Book {
	private Author author;
	private String title;
	private double price;
	private int publishYear;

	public Book(Author author, String title, double price, int publishYear) {
		this.author = author;
		this.title = title;
		this.price = price;
		this.publishYear = publishYear;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}

	public boolean currentBook() {
		return (this.publishYear == 2004) || (this.publishYear == 2003);
	}

	public boolean currentAuthor() {
		return this.author.currentAuthor();
	}

	public boolean thisAuthor(Author that) {
		return this.author.same(that);
	}

	public boolean sameAuthor(Book that) {
		return this.author.same(that.author);
	}

	public boolean sameGeneration(Book that) {
		return this.author.sameGeneration(that.author);
	}
}
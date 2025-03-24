package Đề3;

public abstract class LibaryItem {
	protected int lid;
	protected String title;
	protected Author author;
	protected String publisher;
	protected int maxRentedDays;
	protected double price;

	public LibaryItem(int lid, String title, Author author, String publisher, int maxRentedDays, double price) {
		this.lid = lid;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.maxRentedDays = maxRentedDays;
		this.price = price;
	}

	public abstract String getType();

	public boolean isAuthor(String that) {
		return this.author.isAuthor(that);
	}

	public abstract double lossFee();

	public abstract int howManyStoryAndJournal();
}

package bt5_8;

public class Books {
	private String title;
	private double price;
	private int yearOfPublication;
	private Author author;

	public Books(String title, double price, int yearOfPublication, Author author) {
		super();
		this.title = title;
		this.price = price;
		this.yearOfPublication = yearOfPublication;
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

	public int getYearOfPublication() {
		return yearOfPublication;
	}

	public void setYearOfPublication(int yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public boolean thisAuthor(Author author) {
		return this.author.sameAuthor(author);
	}

	public boolean isTitleBefore(Books that) {
		return this.title.compareTo(that.title) < 0;
	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Books))
			return false;
		else {
			Books that = (Books) obj;
			return this.title.equals(that.title) && this.price == that.price
					&& this.yearOfPublication == that.yearOfPublication && this.author.equals(that.author);
		}
	}
}

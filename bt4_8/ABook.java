package bt4_8;

public abstract class ABook implements IBookStore {
	private String title;
	private String authorName;
	private double price;
	private int publicationYear;

	public ABook(String title, String authorName, double price, int publicationYear) {
		super();
		this.title = title;
		this.authorName = authorName;
		this.price = price;
		this.publicationYear = publicationYear;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public abstract double salePrice();

	public boolean cheaperThan(ABook that) {
		return this.salePrice() < that.salePrice();
	}

	public boolean sameAuthor(ABook that) {
		return this.authorName.equals(that.authorName);
	}

}

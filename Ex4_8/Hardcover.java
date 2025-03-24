package Ex4_8;

public class Hardcover extends ABook {
	public Hardcover(String title, String author, double price, int publicationYear) {
		super(title, author, price, publicationYear);
	}

	public double salePrice() {
		return this.price * 0.8;
	}
}

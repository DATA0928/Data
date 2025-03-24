package bt4_8;

public class HardCoverBook extends ABook {

	public HardCoverBook(String title, String authorName, double price, int publicationYear) {
		super(title, authorName, price, publicationYear);

	}

	@Override
	public double salePrice() {

		return this.getPrice() * 0.8;
	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof HardCoverBook))
			return false;
		else {
			HardCoverBook that = (HardCoverBook) obj;
			return this.equals(that);
		}
	}
}

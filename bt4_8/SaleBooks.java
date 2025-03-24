package bt4_8;

public class SaleBooks extends ABook {

	public SaleBooks(String title, String authorName, double price, int publicationYear) {
		super(title, authorName, price, publicationYear);

	}

	@Override
	public double salePrice() {
		// TODO Auto-generated method stub
		return this.getPrice() * 0.5;
	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof SaleBooks))
			return false;
		else {
			SaleBooks that = (SaleBooks) obj;
			return this.equals(that);
		}
	}
}

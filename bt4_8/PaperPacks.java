package bt4_8;

public class PaperPacks extends ABook {

	public PaperPacks(String title, String authorName, double price, int publicationYear) {
		super(title, authorName, price, publicationYear);

	}

	@Override
	public double salePrice() {
		// TODO Auto-generated method stub
		return this.getPrice();
	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof PaperPacks))
			return false;
		else {
			PaperPacks that = (PaperPacks) obj;
			return this.equals(that);

		}
	}
}

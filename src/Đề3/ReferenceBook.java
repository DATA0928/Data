package Đề3;

public class ReferenceBook extends LibaryItem {
	private String category;

	public ReferenceBook(int lid, String title, Author author, String publisher, int maxRentedDays, double price,
			String category) {
		super(lid, title, author, publisher, maxRentedDays, price);
		this.category = category;
	}

	public String getType() {
		if (this.lid > 100 && this.lid < 200)
			return "ReferenceBook";
		return "";
	}

	public double lossFee() {
		return this.price * 1.2;
	}

	public int howManyStoryAndJournal() {
		return 0;
	}
}

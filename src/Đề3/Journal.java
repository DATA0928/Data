package Đề3;

public class Journal extends LibaryItem {
	private Date publishedDate;

	public Journal(int lid, String title, Author author, String publisher, int maxRentedDays, double price,
			Date publishedDate) {
		super(lid, title, author, publisher, maxRentedDays, price);
		this.publishedDate = publishedDate;
	}
	public String getType() {
		if(this.lid>300 && this.lid<400)
			return "Journal";
		return "";
	}
	public double lossFee() {
		return this.price*0.8;
	}
	public int howManyStoryAndJournal() {
		return 1;
	}
}

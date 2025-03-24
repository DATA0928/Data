package Đề3;

public class Story extends LibaryItem {
	public Story(int lid, String title, Author author, String publisher, int maxRentedDays, double price) {
		super(lid, title, author, publisher, maxRentedDays, price);
	}
	public String getType() {
		if(this.lid>200 && this.lid<300)
			return "Journal";
		return "";
	}
	public double lossFee() {
		return this.price*1.2;
	}
	public int  howManyStoryAndJournal() {
		return 1;
	}
}

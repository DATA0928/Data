package De01;

public class Date {
	private int day; // ngay
	private int month; // thang
	private int year; // nam

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	// phuong thuc xac dinh xem mot ngay co xay ra sau mot ngay khac khong
	public boolean after(Date that) {
		return ((this.year == that.year) && (this.month == that.month) && (this.day > that.day))
				|| ((this.year == that.year) && (this.month > that.month)) || ((this.year > that.year));

	}

	// phuong thuc xac dinh xem mot goi hang co ngay san xuat sau mot ngay nao do
	// hay khong
	public boolean produceAfter(Date that) {
		return ((this.year == that.year) && (this.month == that.month) && (this.day > that.day))
				|| ((this.year > that.year)) || ((this.year == that.year) && (this.month > that.month));
	}

	// phuong thuc xac dinh xem mot goi hang da het han tinh cho den hom nay
	// 22-12-2022
	public boolean isExpired() {
		return ((this.year == 2022) && (this.month == 12) && (this.day < 22)) || (this.year < 2022)
				|| ((this.year == 2022) && (this.month < 12));
	}
}

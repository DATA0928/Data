package Bai3;

public class Date {
	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public boolean ealierThan(Date that) {
		if (this.year < that.year)
			return true;
		else if (this.year > that.year)
			return false;
		else if (this.month < that.month)
			return true;
		else if (this.month > that.month)
			return false;
		else if (this.day < that.day)
			return true;
		else
			return false;
	}
}

package ahjb;

public class Date {
	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	// determine if one date occurs after another day
	public boolean after(Date that) {
		if (this.year > that.year) {
			return true;
		} else if (this.year == that.year) {
			if (this.month > that.month) {
				return true;
			} else if (this.month == that.month) {
				if (this.day > that.day)
					;
				return true;
			}
		}
		return false;
	}

	public boolean before(Date that) {
		if (this.year < that.year) {
			return true;
		} else if (this.year == that.year) {
			if (this.month < that.month) {
				return true;
			} else if (this.month == that.month) {
				if (this.day < that.day)
					;
				return true;
			}
		}
		return false;
	}
}

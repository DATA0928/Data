package Đề2;

import java.util.Objects;

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

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Date)) {
		return false;
		Date that = (Date) obj;
		return this.day == that.day && this.month == that.month && this.year == that.year;
	}
	}
}

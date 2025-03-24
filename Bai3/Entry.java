package Bai3;

public class Entry {
	private Date date;
	private double distance;
	private int duration;
	private String comment;

	public Entry(Date date, double distance, int duration, String comment) {
		this.date = date;
		this.distance = distance;
		this.duration = duration;
		this.comment = comment;
	}

	// computes the pace for a daily entry
	public double pace() {
		return this.duration / this.distance;
	}
	public boolean ealierThan(Entry that){
		return this.date.ealierThan(that.date);
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}

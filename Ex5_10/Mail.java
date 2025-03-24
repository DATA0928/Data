package Ex5_10;

public class Mail {
	private Date date;
	private String from;
	private String manage;

	public Mail(Date date, String from, String manage) {
		this.date = date;
		this.from = from;
		this.manage = manage;
	}

	public boolean after(Mail that) {
		return this.date.after(that.date);
	}
}

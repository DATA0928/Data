package BT5_10;

public class Mails {
	private String from;
	private Date date;
	private String message;

	public Mails(String from, Date date, String message) {
		super();
		this.from = from;
		this.date = date;
		this.message = message;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean after(Mails that) {
		return this.date.after(that.date);
	}

	public String toString() {
		return "from:" + this.from + "," + this.date + ",message:" + this.message;
	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Mails))
			return false;
		else {
			Mails that = (Mails) obj;
			return this.from.equals(that.from) && this.date == that.date && this.message.equals(that.message);
		}
	}

}

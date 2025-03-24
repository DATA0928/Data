package Ex5_10;

public class ConsLoMails implements ILoMails {
	private Mail first;
	private ILoMails rest;

	public ConsLoMails(Mail first, ILoMails rest) {
		this.first = first;
		this.rest = rest;
	}

	public ILoMails sortByDate() {
		return this.rest.sortByDate().insertInDateOrder(this.first);

	}

	public ILoMails insertInDateOrder(Mail mail) {
		if (mail.after(this.first))
			return new ConsLoMails(mail, this);
		else
			return new ConsLoMails(this.first, this.rest.insertInDateOrder(mail));

	}
}

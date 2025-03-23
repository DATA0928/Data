package BT5_10;

public class ConsLoMails implements ILoMails {
	private Mails first;
	private ILoMails rest;

	public ConsLoMails(Mails first, ILoMails rest) {
		super();
		this.first = first;
		this.rest = rest;
	}

	public Mails getFirst() {
		return first;
	}

	public void setFirst(Mails first) {
		this.first = first;
	}

	public ILoMails getRest() {
		return rest;
	}

	public void setRest(ILoMails rest) {
		this.rest = rest;
	}

	@Override
	public ILoMails sortByDate() {
		return this.rest.sortByDate().insertInDateOrder(this.first);
	}

	@Override
	public ILoMails insertInDateOrder(Mails E) {
		if (E.after(this.first))
			return new ConsLoMails(E, this);
		else
			return new ConsLoMails(this.first, this.rest.insertInDateOrder(E));

	}

	public String toString() {
		return this.first + "\n" + this.rest;
	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof ConsLoMails))
			return false;
		else {
			ConsLoMails that = (ConsLoMails) obj;
			return this.first.equals(that.first) && this.rest.equals(that.rest);
		}
	}

}

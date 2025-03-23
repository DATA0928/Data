package BT5_10;

public class MTLoMails implements ILoMails {

	@Override
	public ILoMails sortByDate() {

		return new MTLoMails();
	}

	@Override
	public ILoMails insertInDateOrder(Mails E) {

		return new ConsLoMails(E, new MTLoMails());
	}

	public String toString() {
		return "";
	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof MTLoMails))
			return false;
		return true;

	}

}

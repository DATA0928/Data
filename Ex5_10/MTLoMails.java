package Ex5_10;

public class MTLoMails implements ILoMails {
	public ILoMails sortByDate() {
		return new MTLoMails();
	}

	public ILoMails insertInDateOrder(Mail e) {
		return new ConsLoMails(e, new MTLoMails());
	}
}

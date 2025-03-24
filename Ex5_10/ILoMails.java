package Ex5_10;

public interface ILoMails {
	// sort list of mails by date
	public ILoMails sortByDate();

	public ILoMails insertInDateOrder(Mail e);
}

package Ex5_10;

import junit.framework.TestCase;

public class LoMailsTest extends TestCase {
	public void testSortByDate() {
		Mail m1 = new Mail(new Date(19, 7, 2020), "ha@gmail.com", "yen@gmail.com");
		Mail m2 = new Mail(new Date(2, 1, 2021), "ha@gmail.com", "ha@gmail.com");
		Mail m3 = new Mail(new Date(17, 4, 2020), "ha@gmail.com", "van@hcmuaf.edu.vn");
		Mail m4 = new Mail(new Date(25, 7, 2020), "kcntt@gmail.com", "nguyenty@gmail.com");
		ILoMails empty = new MTLoMails();
		ILoMails i2 = new ConsLoMails(m1, new ConsLoMails(m2, empty));
		ILoMails all = new ConsLoMails(m1, new ConsLoMails(m2, new ConsLoMails(m3, new ConsLoMails(m4, empty))));
		assertEquals(empty.sortByDate(), new MTLoMails());
		assertEquals(i2.sortByDate(), new ConsLoMails(m2, new ConsLoMails(m1, new MTLoMails())));
		assertEquals(all.sortByDate(),
				new ConsLoMails(m2, new ConsLoMails(m4, new ConsLoMails(m1, new ConsLoMails(m3, new MTLoMails())))));
	}
}

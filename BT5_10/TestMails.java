package BT5_10;

import junit.framework.TestCase;

public class TestMails extends TestCase {
	public void testSortByDate() {
		Mails m1 = new Mails("ha@gmail.com",new Date(19, 7, 2020),"yen@gmail.com");

		Mails m2 = new Mails("ha@gmail.com",new Date(2, 1, 2021), "ha@gmail.com");

		Mails m3 = new Mails("ha@gmail.com",new Date(17, 4, 2020), "van@hcmuaf.edu.vn");

		Mails m4 = new Mails("kcntt@gmail.com", new Date(25, 7, 2020), "nguyenty@gmail.com");

		ILoMails empty = new MTLoMails();
		ILoMails i2 = new ConsLoMails(m1,
				

		new ConsLoMails(m2, empty));

		ILoMails all = new ConsLoMails(m1, new ConsLoMails(m2,
		new ConsLoMails(m3, new ConsLoMails(m4, empty))));
		assertEquals(empty.sortByDate(), new MTLoMails());
		assertEquals(i2.sortByDate(), new ConsLoMails(m2,

		new ConsLoMails(m1, new MTLoMails())));

		assertEquals(all.sortByDate(),

		new ConsLoMails(m2, new ConsLoMails(m4,
		new ConsLoMails(m1, new ConsLoMails(m3,
		new MTLoMails())))));
}
}
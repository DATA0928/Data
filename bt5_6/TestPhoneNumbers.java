package bt5_6;

import junit.framework.TestCase;

public class TestPhoneNumbers extends TestCase {

	PhoneRecord d1 = new PhoneRecord("Peter", "0908123456");
	PhoneRecord d2 = new PhoneRecord("Wanda", "0918234568");
	PhoneRecord d3 = new PhoneRecord("Tchalla", "0933456789");
	PhoneRecord d4 = new PhoneRecord("Angela", "0971567890");
	IPhoneDirectory all = new ConsPhoneDirectory(d1,

			new ConsPhoneDirectory(d2, new ConsPhoneDirectory(d3, new ConsPhoneDirectory(d4, new MTPhoneDirectory()))));

	public void testWhoseNumbers() {
		assertEquals(all.whoseNumbers("0908123452"), "None Exist");
		assertEquals(all.whoseNumbers("0908123456"), "Peter");
		assertEquals(all.whoseNumbers("0971567890"), "Angela");
	}

	public void testphoneNumber() {
		assertEquals(all.phoneNumbers("TaoChen"), "None Exist");
		assertEquals(all.phoneNumbers("Peter"), "0908123456");
		assertEquals(all.phoneNumbers("Tchalla"), "0933456789");
	}
}

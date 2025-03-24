package Bai3;

import junit.framework.TestCase;

public class EntryTest extends TestCase {
	public void testConstructor() {
		new Entry(new Date(5, 6, 2004), 5.3, 27, "good");
		new Entry(new Date(6, 6, 2004), 2.8, 24, "tired");
		Date date1 = new Date(23, 6, 2004);
		new Entry(date1, 26.2, 159, "exhausted");
	}

	public void testPace() {
		Entry entry1 = new Entry(new Date(5, 6, 2004), 5.3, 27, "good");
		assertEquals(entry1.pace(), 5.094, 0.001);
		Entry entry2 = new Entry(new Date(6, 6, 2004), 2.8, 24, "tired");
		assertEquals(entry2.pace(), 8.571, 0.001);
		Entry entry3 = new Entry(new Date(23, 6, 2004), 26.2, 159, "exhausted");
		assertEquals(entry3.pace(), 6.069, 0.001);
	}

	public void testEarlierThan() {
		Date date1 = new Date(30, 6, 2003);
		Date date2 = new Date(1, 1, 2004);
		Date date3 = new Date(1, 12, 2003);
		Date date4 = new Date(15, 12, 2004);
		Date date5 = new Date(31, 12, 2004);
		assertTrue(date1.ealierThan(date2));
		assertFalse(date2.ealierThan(date3));
		assertTrue(date3.ealierThan(date4));
		assertTrue(date4.ealierThan(date5));
		assertFalse(date1.ealierThan(date1));
		assertFalse(date5.ealierThan(date4));
		assertFalse(date4.ealierThan(date3));
		assertTrue(date3.ealierThan(date2));
		assertFalse(date2.ealierThan(date1));
	}

	public void testEalierThan() {
		Entry e1 = new Entry(new Date(5, 6, 2004), 5.3, 27, "good");
		Date date1 = new Date(6, 6, 2004);
		Entry e2 = new Entry(date1, 2.8, 24, "tired");
		Date date2 = new Date(23, 6, 2004);
		Entry e3 = new Entry(date2, 26.2, 159, "exhausted");
		assertTrue(e1.ealierThan(e2));
		assertFalse(e1.ealierThan(e1));
		assertFalse(e3.ealierThan(e2));
	}

}

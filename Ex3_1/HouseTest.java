package Ex3_1;

import junit.framework.TestCase;

public class HouseTest extends TestCase {
	House h1 = new House("Ranch", 7, new Address("23", "Mapple Street", "Brooklyn"), 375000);
	House h2 = new House("Colonial", 9, new Address("5", "Jove Road", "Newton"), 450000);
	House h3 = new House("Cape", 6, new Address("83", "Winslow Road", "Waltham"), 235000);

	public void testHasMoreRooms() {
		assertFalse(h1.hasMoreRooms(h2));
		assertTrue(h2.hasMoreRooms(h3));
	}

	public void testThisCity() {
		assertTrue(h1.inThisCity("Brooklyn"));
		assertFalse(h1.inThisCity("Newton"));
	}

	public void testsameCity() {
		assertTrue(h1.sameCity(h1));
		assertFalse(h1.sameCity(h2));
	}
}

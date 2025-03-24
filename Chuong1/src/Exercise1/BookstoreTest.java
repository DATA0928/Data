package Exercise1;

import junit.framework.TestCase;

public class BookstoreTest extends TestCase {
	public void testConstruction() {
		new Bookstore("Daniel Defoe", "Robinson Crusoe", 15.50, 1719);
		new Bookstore("Joseph Conrad", "Heart of Darkness", 12.80, 1902);
		new Bookstore("Pat Conroy", "Beach Music", 9.50, 1996);
		}
}

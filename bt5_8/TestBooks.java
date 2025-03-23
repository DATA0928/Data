package bt5_8;

import junit.framework.TestCase;

public class TestBooks extends TestCase {
	public void testConstructor() {
		Books b1 = new Books("The Da Vinci Code", 16.1, 2003, new Author("Dan Brown", 1964));
		Books b2 = new Books("Robinson Crusoe", 15.50, 1719, new Author("Daniel Defoe", 1960));

		Books b3 = new Books("Beach Music", 9.50, 1996,

				new Author("Pat Conroy", 1945));
		Books b4 = new Books("Digital Fortress", 14.3, 1998, new Author("Dan Brown", 1964));

		ILoBooks empty = new MTLoBooks();
		ILoBooks all = new ConsLoBooks(b1, new ConsLoBooks(b2,

				new ConsLoBooks(b3, new ConsLoBooks(b4, empty))));

		assertEquals(empty.thisAuthor(new Author("Dan Brown", 1964)),

				new MTLoBooks());

		assertEquals(all.thisAuthor(new Author("Dan Brown", 1964)),

				new ConsLoBooks(b1, new ConsLoBooks(b4, new MTLoBooks())));

		assertEquals(empty.sortByTitle(), new MTLoBooks());
		assertEquals(all.sortByTitle(),
				new ConsLoBooks(b3, new ConsLoBooks(b4, new ConsLoBooks(b2, new ConsLoBooks(b1, new MTLoBooks())))));
	}
}
package Ex5_8;

import junit.framework.TestCase;

public class BookTest extends TestCase {
	Book b1 = new Book("The Da Vinci Code", 16.1, 2003, new Author("Dan Brown", 1964));
	Book b2 = new Book("Robinson Crusoe", 15.50, 1719, new Author("Daniel Defoe", 1960));
	Book b3 = new Book("Beach Music", 9.50, 1996, new Author("Pat Conroy", 1945));
	Book b4 = new Book("Digital Fortress", 14.3, 1998, new Author("Dan Brown", 1964));
	ILoBooks empty = new MTLoBooks();
	ILoBooks all = new ConsLoBooks(b1, new ConsLoBooks(b2, new ConsLoBooks(b3, new ConsLoBooks(b4, empty))));

	public void testThisAuthor() {
		assertEquals(empty.thisAuthor(new Author("Dan Brown", 1964)), new MTLoBooks());
		assertEquals(all.thisAuthor(new Author("Dan Brown", 1964)),
				new ConsLoBooks(b1, new ConsLoBooks(b4, new MTLoBooks())));
	}

	public void testSortByTitle() {
		assertEquals(empty.sortByTitle(), new MTLoBooks());
		assertEquals(all.sortByTitle(),
				new ConsLoBooks(b3, new ConsLoBooks(b4, new ConsLoBooks(b2, new ConsLoBooks(b1, new MTLoBooks())))));

	}
}

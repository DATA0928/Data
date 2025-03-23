package bt5_2;

import junit.framework.TestCase;

public class TestBook extends TestCase {
	public void testConstructor() {
		Book A1 = new Book("Robinson Crusoe", 90, 1904, "Daniel Defoe");
		Book A2 = new Book("Heart Of Darkness", 100, 1940, "Joseph Conrad");
		Book A3 = new Book("Beach Music", 90, 1904, "Pat Conroy");

		IBooks empty = new MTBooks();
		IBooks B1 = new ConsBooks(A3, empty);
		IBooks B2 = new ConsBooks(A2, B1);
		IBooks B3 = new ConsBooks(A1, B2);
		System.out.println(B3.toString());

		MyBook C = new MyBook("Robinson Crusoe", 90, 1904, "Daniel Defoe",new MyFavoriteBook("A Brief History of Time","Stephen Hawking"));
		IBooks empty1=new MTBooks();
		IBooks A4=new ConsBooks1(C,empty1);
		System.out.println(A4);
		
	}
}

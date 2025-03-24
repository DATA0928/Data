package Bai1;
import junit.framework.TestCase;

public class EntryTest extends TestCase {
	public void testConstruction () {
		new Entry(new Date(5, 6, 2004), 5.3, 27, "good");
		new Entry(new Date(6, 6, 2004), 2.8, 24, "tired");
		Date date1 = new Date(23, 6, 2004);
		new Entry(date1, 26.2, 159, "exhausted");
	}
}

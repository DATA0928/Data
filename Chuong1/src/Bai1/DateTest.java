package Bai1;
import junit.framework.TestCase;

public class DateTest extends TestCase {
	public void testConstrutor() {
		new Date(5, 6, 2003); // denotes June 5, 2003
		new Date(6, 6, 2003); // denotes June 6, 2003
		new Date(23, 6, 2000); // denotes June 23, 2000
		}
}

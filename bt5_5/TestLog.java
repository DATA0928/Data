package bt5_5;

import junit.framework.TestCase;

public class TestLog extends TestCase {
	public void testMiles() {
		Entry e1 = new Entry(new Date(5, 6, 2005), 5.0, 25, "Good");
		Entry e2 = new Entry(new Date(6, 6, 2005), 3.0, 24, "Tired");
		Entry e3 = new Entry(new Date(23, 6, 2005), 26.0, 156, "Great");
		ILog empty = new MTLog();
		ILog l1 = new ConsLog(e3, empty);
		ILog l2 = new ConsLog(e2, l1);
		ILog l3 = new ConsLog(e1, l2);
		System.out.println(l3.toString());
		
		assertEquals(empty.miles(3, 2007),0.0);
		assertEquals(l1.miles(6, 2005),26.0);
		assertEquals(l2.miles(6, 2005),29.0);
		assertEquals(l3.miles(6, 2005),34.0);
		
		assertEquals(empty.minDistance(),0.0);
		assertEquals(l1.minDistance(),26.0);
		assertEquals(l2.minDistance(),3.0);
		assertEquals(l3.minDistance(),3.0);
		
		assertEquals(empty.minHelper(4),4.0);
		assertEquals(l1.minHelper(4),4.0);
		assertEquals(l2.minHelper(4),3.0);
		assertEquals(l3.minHelper(4),3.0);
		
	}	
}

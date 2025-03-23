package VD1;

import junit.framework.TestCase;

public class TestEntry extends TestCase {
	public void testConstructor() {
		Entry A1 = new Entry(new Date(17, 12, 2006), 24, 220, "tired");
		Entry A2 = new Entry(new Date(13, 12, 2006), 20, 250, "exhausted");
		Entry A3 = new Entry(new Date(15, 12, 2006), 25, 100, "nice");

		ILog empty = new MTLog();
		ILog C1 = new ConsLog(A3, empty);
		ILog C2 = new ConsLog(A2, C1);
		ILog C3 = new ConsLog(A1, C2);
		System.out.println(C3);

		ILog all = new ConsLog(A1, new ConsLog(A2, new ConsLog(A3, empty)));
		System.out.println(all);
		
		assertEquals(C3,all);
	}

	
	

}

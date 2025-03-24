package Exercise1;

import junit.framework.TestCase;

public class TimeTest extends TestCase {
	public void testConstruction () {
		new Time (2, 30, 30);
		new Time (0, 15, 45);
		new Time (7, 50, 0);
	}
}

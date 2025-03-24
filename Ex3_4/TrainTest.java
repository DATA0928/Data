package Ex3_4;

import junit.framework.TestCase;

public class TrainTest extends TestCase {
	ClockTime c1 = new ClockTime(19, 30);
	ClockTime c2 = new ClockTime(20, 30);
	ClockTime c3 = new ClockTime(21, 45);
	ClockTime c4 = new ClockTime(23, 00);

	Schedule s1 = new Schedule(c1, c2);
	Schedule s2 = new Schedule(c1, c3);
	Schedule s3 = new Schedule(c2, c4);
	Schedule s4 = new Schedule(c3, c4);

	Route r1 = new Route("Ho Chi Minh", "Ha Noi");
	Route r2 = new Route("Ha Noi", "Vinh");
	Route r3 = new Route("Tay Ninh", "Ho Chi Minh");
	Route r4 = new Route("Vinh", "Ho Chi Minh");

	Train t1 = new Train(s1, r1, true);
	Train t2 = new Train(s2, r2, false);
	Train t3 = new Train(s3, r3, true);
	Train t4 = new Train(s4, r4, false);

	public void testCheck() {
		assertTrue(t1.Check("Ha Noi"));
		assertFalse(t2.Check("Tay Ninh"));
		assertTrue(t3.Check("Ho Chi Minh"));
		assertFalse(t4.Check("Vinh"));
	}

	public void testDepature() {
		assertEquals(t1.Departs(), c1);
		assertEquals(t2.Departs(), c1);
		assertEquals(t3.Departs(), c2);
		assertEquals(t4.Departs(), c3);
	}

	public void testTime() {
		assertEquals(t1.ThoiGian(), new ClockTime(1, 00));
		assertEquals(t2.ThoiGian(), new ClockTime(2, 15));
		assertEquals(t3.ThoiGian(), new ClockTime(2, 30));
		assertEquals(t4.ThoiGian(), new ClockTime(1, 15));
		
	}
}

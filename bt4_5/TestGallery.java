package bt4_5;

import junit.framework.TestCase;

public class TestGallery extends TestCase {
	public void testConstructor() {
		Sounds A1 = new Sounds("a music piece,stored in theme.mp3", 40960, new Time(0, 3, 20));
		Images A2 = new Images("an image, stored in flower.gif", 57234, 100, 50, "medium");
		Texts A3 = new Texts("a text, stored in welcome.txt", 5312, 830);

		assertEquals(A1.timeToDownLoad(50), 819.2, 0.001);
		assertEquals(A2.timeToDownLoad(50), 1144.68, 0.001);
		assertEquals(A3.timeToDownLoad(50), 106.24, 0.001);

		assertFalse(A1.smallerThan(40000));
		assertTrue(A2.smallerThan(60000));
		assertTrue(A3.smallerThan(6000));
		
		assertFalse(A1.sameName("gjfldhsfg"));
		assertFalse(A2.sameName("gjfldhsfg"));
		assertTrue(A3.sameName("a text, stored in welcome.txt"));
		

	}

}

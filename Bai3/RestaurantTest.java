package Bai3;

import junit.framework.TestCase;

public class RestaurantTest extends TestCase {
	
	public void testCloseTo() {
		Intersection i1 = new Intersection(3, 3);
		Intersection i2 = new Intersection(3, 2);
		assertTrue(i1.closeTo(i2));
		assertFalse(i1.closeTo(new Intersection(3, 5)));
		Restaurant r1 = new Restaurant("La Crepe", "French", "moderate", new Intersection(3, 3));
		Restaurant r2 = new Restaurant("Das Bier", "German", "cheap", new Intersection(3, 2));
		Restaurant r3 = new Restaurant("Sun", "Chinese", "cheap", new Intersection(3, 5));
		assertTrue(r1.closeTo(r2));
		assertFalse(r1.closeTo(r3));
		assertFalse(r2.closeTo(r3));
	}
}

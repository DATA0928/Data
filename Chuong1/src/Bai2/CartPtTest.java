package Bai2;

import junit.framework.TestCase;

public class CartPtTest extends TestCase {
	public void testConstruction () {
		new CartPt(5, 12);
		new CartPt (3, 4);
		new CartPt(4, 7);
	}
	
	public void testDistanceToO() {
		assertEquals(new CartPt(5, 12).distanceToO(), 13.0, 0.001);
		CartPt aCartPt1 = new CartPt(0, 3);
		assertEquals(aCartPt1.distanceToO(), 3.0, 0.001);
		CartPt aCartPt2 = new CartPt(4, 7);
		assertEquals(aCartPt2.distanceToO(), 8.062, 0.001);
		}
	public void testDistanceTo() {
		assertEquals(new CartPt(6, 8).distanceTo(new CartPt(3, 4)), 5.0, 0.001);
		assertEquals(new CartPt(0, 3).distanceTo(new CartPt(4, 0)), 5.0, 0.001);
		CartPt aCartPt1 = new CartPt(1, 2);
		CartPt aCartPt2 = new CartPt(5, 3);
		assertEquals(aCartPt1.distanceTo(aCartPt2), 4.123, 0.001);
		}
}

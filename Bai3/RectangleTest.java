package Bai3;

import junit.framework.TestCase;

public class RectangleTest extends TestCase {
	public void testDistanceToO() {
		CartPt p = new CartPt(3, 4);
		Rectangle r = new Rectangle(p, 5, 17);
		assertEquals(p.distanceToO(), 5, 0.001);
		assertEquals(r.distanceToO(), 5, 0.001);
		CartPt q = new CartPt(5, 12);
		Rectangle s = new Rectangle(q, 10, 10);
		assertEquals(q.distanceToO(), 13, 0.001);
		assertEquals(s.distanceToO(), 13, 0.001);
	}

	public void testCartPtTranslate() {
		assertEquals(new CartPt(3, 4).translate(2, 8), new CartPt(5, 12));
		assertEquals(new CartPt(1, 4).translate(3, 5), new CartPt(4, 9));
		CartPt q = new CartPt(4, 7);
		assertEquals(q.translate(0, 0), new CartPt(4, 7));
	}
	public void testCenter() {
		assertEquals(new CartPt(3, 4).translate(2, 8), new CartPt(5, 12));
		assertEquals(new CartPt(1, 4).translate(3, 5), new CartPt(4, 9));
		assertEquals(new Rectangle(new CartPt(3, 4), 4, 17).center(), new CartPt(5, 12));
		Rectangle re = new Rectangle(new CartPt(1, 4), 7, 10);
		assertEquals(re.center(), new CartPt(4, 9));
		}
	public void testdistanceFromCenterToO() {
		assertEquals(new Rectangle(new CartPt(3, 4), 4, 17).distanceFromCenterToO(), 13.0, 0.001);
		Rectangle re = new Rectangle(new CartPt(1, 4), 7, 10);
		assertEquals(re.distanceFromCenterToO(), 9.849, 0.001);
		}
}

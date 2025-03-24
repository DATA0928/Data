package bai4_1;

import junit.framework.TestCase;

public class ShapeTest extends TestCase {

	public void testArea() {
		assertEquals(new Dot(new CartPt(4, 3)).area(), 0.0, 0.001);
		assertEquals(new Square(new CartPt(4, 3), 30).area(), 900, 0.001);
		assertEquals(new Circle(new CartPt(5, 5), 20).area(), 1256.637, 0.001);
		IShape s1 = new Dot(new CartPt(4, 3));
		IShape s2 = new Square(new CartPt(4, 3), 30);
		IShape s3 = new Circle(new CartPt(5, 5), 20);
		assertEquals(s1.area(), 0.0, 0.001);
		assertEquals(s2.area(), 900, 0.001);
		assertEquals(s3.area(), 1256.637, 0.001);
	}

	public void testDistanceToO() {
		assertEquals(new Dot(new CartPt(4, 3)).distanceToO(), 5.0, 0.001);
		assertEquals(new Square(new CartPt(4, 3), 30).distanceToO(), 5.0, 0.001);
		assertEquals(new Circle(new CartPt(12, 5), 20).distanceToO(), 13.0, 0.001);
	}

	public void testContain() {
		assertTrue(new Dot(new CartPt(100, 200)).contains(new CartPt(100, 200)));
		assertFalse(new Dot(new CartPt(100, 200)).contains(new CartPt(80, 220)));
		assertTrue(new Square(new CartPt(100, 200), 40).contains(new CartPt(120, 220)));
		assertFalse(new Square(new CartPt(100, 200), 40).contains(new CartPt(80, 220)));
		assertTrue(new Circle(new CartPt(0, 0), 20).contains(new CartPt(4, 3)));
		assertFalse(new Circle(new CartPt(0, 0), 10).contains(new CartPt(12, 5)));
	}

	public void testBoundingBox() {
		assertEquals(new Dot(new CartPt(4, 3)).boundingBox(), new Square(new CartPt(4, 3), 0));
		assertEquals(new Square(new CartPt(4, 3), 30).boundingBox(), new Square(new CartPt(4, 3), 30));
		assertEquals(new Circle(new CartPt(10, 30), 20).boundingBox(), new Square(new CartPt(-10, 10), 40));
	}
}
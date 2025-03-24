package BT4_4;

import junit.framework.TestCase;

public class TestShape extends TestCase {
	public void testConstructor() {
		CartPt A1 = new CartPt(3, 5);
		CartPt A2 = new CartPt(3, 2);
		CartPt A3 = new CartPt(3, 5);
		IShape B1 = new Dot(A1);
		IShape B2 = new Square(A2, 9);
		IShape B3 = new Circle(A1, 5);
		IShape B4 = new Rectangle(A3, 4, 3);

		assertEquals(B1.area(), 0, 0.001);
		assertEquals(B2.area(), 81, 0.001);
		assertEquals(B3.area(), 78.54, 0.001);
		assertEquals(B4.area(), 12, 0.001);

		assertEquals(B1.distanceToO(), 5.83, 0.001);
		assertEquals(B2.distanceToO(), 3.605, 0.001);
		assertEquals(B3.distanceToO(), 5.83, 0.001);
		assertEquals(B4.distanceToO(), 5.83, 0.001);

		assertTrue(B1.contains(new CartPt(3, 5)));
		assertTrue(B2.contains(new CartPt(3, 5)));
		assertTrue(B3.contains(new CartPt(3, 5)));
		assertTrue(B4.contains(new CartPt(3, 6)));

		assertEquals(new Dot(A1).boundingBox(),new Rectangle(new CartPt(3, 5),0,0));
		assertEquals(new Square(A2,9).boundingBox(),new Rectangle(A2,9,9));
		assertEquals(new Circle(A1,5).boundingBox(),new Rectangle(new CartPt(-2, 0),10,10));
		assertEquals(new Rectangle(A3,4,3).boundingBox(),new Rectangle(new CartPt(3, 5),4,3));
		
		assertEquals(B1.perimeter(),1,0.001);
		assertEquals(B2.perimeter(),36,0.001);
		assertEquals(B3.perimeter(),31.416,0.001);
		assertEquals(B4.perimeter(),14,0.001);

		

	}
}

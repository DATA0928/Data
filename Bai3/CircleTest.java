package Bai3;

import junit.framework.TestCase;

public class CircleTest extends TestCase {
	public void testDistanceToO() {
		Circle c1 = new Circle(new CartPt(3, 4), 5);
		Circle c2 = new Circle(new CartPt(5, 12), 10);
		Circle c3 = new Circle(new CartPt(-1, 2), 20);
		assertEquals(c1.distanceToO(), 5.0, 0.001);
		assertEquals(c2.distanceToO(), 13.0, 0.001);
		assertEquals(c3.distanceToO(), 2.236, 0.001);
	}

	public void testPerimeter() {
		Circle c1 = new Circle(new CartPt(3, 4), 5);
		Circle c2 = new Circle(new CartPt(5, 12), 10);
		Circle c3 = new Circle(new CartPt(-1, 2), 20);
		assertEquals(c1.perimeter(), 31.416, 0.001);
		assertEquals(c2.perimeter(), 62.832, 0.001);
		assertEquals(c3.perimeter(), 125.664, 0.001);
	}

	public void testArea() {
		Circle c1 = new Circle(new CartPt(3, 4), 5);
		Circle c2 = new Circle(new CartPt(5, 12), 10);
		Circle c3 = new Circle(new CartPt(-1, 2), 20);

		assertEquals(c1.area(), 78.539, 0.001);
		assertEquals(c2.area(), 314.159, 0.001);
		assertEquals(c3.area(), 1256.637, 0.001);

		assertEquals(c2.area(5), 235.619, 0.001);
		assertEquals(c3.area(5), 1178.097, 0.001);
		assertEquals(c3.area(10), 942.478, 0.001);
		}
	public void testVolume() {
		Circle c1 = new Circle(new CartPt(3, 4), 5);
		Circle c2 = new Circle(new CartPt(5, 12), 10);
		Circle c3 = new Circle(new CartPt(6, 8), 20);
		Cylinder cy1 = new Cylinder(c1, 10);
		Cylinder cy2 = new Cylinder(c2, 30);
		Cylinder cy3 = new Cylinder(c3, 40);
		assertEquals(cy1.volume(), 785.398, 0.001);
		assertEquals(cy2.volume(), 9424.778, 0.001);
		assertEquals(cy3.volume(), 50265.482, 0.001);
		}

	public void testSurface() {
		Circle c1 = new Circle(new CartPt(3, 4), 5);
		Circle c2 = new Circle(new CartPt(5, 12), 10);
		Circle c3 = new Circle(new CartPt(6, 8), 20);
		Cylinder cy1 = new Cylinder(c1, 10);
		Cylinder cy2 = new Cylinder(c2, 30);
		Cylinder cy3 = new Cylinder(c3, 40);
		assertEquals(cy1.surface(), 314.16, 0.01);
		assertEquals(cy2.surface(), 1884.95, 0.01);
		assertEquals(cy3.surface(), 5026.54, 0.01);
	}

}

package Ex5_12;

import junit.framework.TestCase;

public class ShapeTest extends TestCase {
	IShape s1 = new Square(new CartPt(4, 3), 40);
	IShape s2 = new Square(new CartPt(3, 4), 50);
	IShape c1 = new Circle(new CartPt(0, 0), 20);
	IShape c2 = new Circle(new CartPt(12, 5), 20);
	IShape u1 = new CompositeShape(s1, s2);
	IShape u2 = new CompositeShape(s1, c2);
	IShape u3 = new CompositeShape(c1, u1);
	IShape u4 = new CompositeShape(u3, u2);

	s1.boundingBox()
	should be new Rectangle(new CartPt(4,3),40,40)s2.boundingBox()
	should be new Rectangle(new CartPt(3,4),50,50)c1.boundingBox()
	should be new Rectangle(new CartPt(-20,-20),40,40)c2.boundingBox()
	should be new Rectangle(new CartPt(-8,-15),40,40)u1.boundingBox()
	should be new Rectangle(new CartPt(3,3),50,51)u2.boundingBox()
	should be new Rectangle(new CartPt(-8,-15),52,58)u3.boundingBox()
	should be new Rectangle(new CartPt(-20,-2),73,74)u4.boundingBox()
	should be new Rectangle(new CartPt(-20,-20,73,74)
}

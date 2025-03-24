package Bai1;
import junit.framework.TestCase;

public class RectangleTest extends TestCase {
	public void testContructor() {
		CartPt p = new CartPt(3, 4);
		CartPt q = new CartPt(5, 12);
		new Rectangle(p, 5, 17);
		new Rectangle(q, 10, 10);
		new Rectangle(new CartPt(4, 3), 5, 12);
		}
}

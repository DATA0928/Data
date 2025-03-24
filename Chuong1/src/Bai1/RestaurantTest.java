package Bai1;
import junit.framework.TestCase;

public class RestaurantTest extends TestCase {
	public void testConstructor() {
		new Restaurant("La Crepe", "French", "moderate", new Intersection(7, 65));
		new Restaurant("Bremen Haus", "German", "moderate", new Intersection(2, 86));
		Intersection intersection1 = new Intersection(10, 113);
		new Restaurant("Moon Palace", "Chinese", " inexpensive", intersection1);
		}
}

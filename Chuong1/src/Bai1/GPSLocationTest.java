package Bai1;
import junit.framework.TestCase;

public class GPSLocationTest extends TestCase {
	public void testConstructor() {
		new GPSLocation(33.5, 86.8);
		new GPSLocation(40.2, 72.4);
		new GPSLocation(49.0, 110.3);
		}
}

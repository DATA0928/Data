package Ex4_2;

import junit.framework.TestCase;

public class AGalleryTest extends TestCase {
	public void testConstructor() {
	Image i1 = new Image("flower.gif", 57234, 100, 50, "medium");
	Text t1 = new Text("welcome.txt", 5312, 830);
	Sound s1 = new Sound("theme.mp3",40960, 200);
	}
}

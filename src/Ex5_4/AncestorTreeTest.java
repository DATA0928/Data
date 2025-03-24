package Ex5_4;

import junit.framework.TestCase;

public class AncestorTreeTest extends TestCase {
	public void testConstructor() {
		IAncestorTree unknown = new Unknown();
		IAncestorTree bob = new ConsAncesterTree(new Person("Bob", 1917), unknown, unknown);
		IAncestorTree angela = new ConsAncesterTree(new Person("Angela", 1936), unknown, unknown);
		IAncestorTree robert = new ConsAncesterTree(new Person("Robert", 1935), unknown, unknown);
		IAncestorTree annie = new ConsAncesterTree(new Person("Annie", 1938), bob, unknown);
		IAncestorTree janet = new ConsAncesterTree(new Person("Janet", 1958), robert, angela);
		IAncestorTree paul = new ConsAncesterTree(new Person("Paul", 1956), unknown, annie);
		IAncestorTree peter = new ConsAncesterTree(new Person("Peter", 1980), paul, janet);
		IAncestorTree all = new ConsAncesterTree(new Person("Peter", 1980),
				new ConsAncesterTree(new Person("Paul", 1956), unknown,
						new ConsAncesterTree(new Person("Annie", 1938),
								new ConsAncesterTree(new Person("Bob", 1917), unknown, unknown), unknown)),
				new ConsAncesterTree(new Person("Janet", 1958),
						new ConsAncesterTree(new Person("Robert", 1935), unknown, unknown),
						new ConsAncesterTree(new Person("Angela", 1936), unknown, unknown)));
	}
}

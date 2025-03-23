package bt5_4;

import junit.framework.TestCase;

public class TestAncestorTree extends TestCase {
	public void testConstructor() {
		IAncestorTree unknown = new Unknown();
		IAncestorTree bob = new ConsAncestorTree(

				new Person("Bob", 1917), unknown, unknown);

		IAncestorTree angela = new ConsAncestorTree(

				new Person("Angela", 1936), unknown, unknown);

		IAncestorTree robert = new ConsAncestorTree(

				new Person("Robert", 1935), unknown, unknown);

		IAncestorTree annie = new ConsAncestorTree(new Person("Annie", 1938), bob, unknown);
		IAncestorTree janet = new ConsAncestorTree(

				new Person("Janet", 1958), robert, angela);

		IAncestorTree paul = new ConsAncestorTree(

				new Person("Paul", 1956), unknown, annie);

		IAncestorTree peter = new ConsAncestorTree(new Person("Peter", 1980), paul, janet);

		IAncestorTree all = new ConsAncestorTree(new Person("Peter", 1980),
				new ConsAncestorTree(new Person("Paul", 1956), unknown,
						new ConsAncestorTree(new Person("Annie", 1938),
								new ConsAncestorTree(new Person("Bob", 1917), unknown, unknown), unknown)),

				new ConsAncestorTree(new Person("Janet", 1958),
						new ConsAncestorTree(new Person("Robert", 1935), unknown, unknown),
						new ConsAncestorTree(new Person("Angela", 1936), unknown, unknown)

				));
		System.out.println(all);
		System.out.println(peter);
	}

}

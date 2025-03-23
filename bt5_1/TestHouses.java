package bt5_1;

import junit.framework.TestCase;

public class TestHouses extends TestCase {
	public void testConstructor() {
		Address A1 = new Address("23", "Maple", "Brookline");
		Address A2 = new Address("5", "Joye", "Newton");
		Address A3 = new Address("83", "Winslow Road", "Waltham");

		House Range = new House("Range", 9, 30.5, A1);
		House Colonial = new House("Colonial", 7, 300, A2);
		House Cape = new House("Cape", 90, 200.5, A3);

		IHouses empty = new MTHouses();
		IHouses B1 = new ConsHouses(Cape, empty);
		IHouses B2 = new ConsHouses(Colonial, B1);
		IHouses B3 = new ConsHouses(Range, B2);
		System.out.println(B3);

		IHouses all = new ConsHouses(Range, new ConsHouses(Colonial, new ConsHouses(Cape, empty)));
		System.out.println(all.toString());
	}
}

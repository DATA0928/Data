package Ex5_7;

import junit.framework.TestCase;

public class ShoppingListTest extends TestCase {
	AnItem c1 = new Coffee("Trung Nguyen", 15.5, 25.0, "regular");
	AnItem j1 = new Juice("VinaJuice", 20.0, 35.5, "chocolate", "bottle");
	AnItem i1 = new IceCream("VinaMilk", 16.0, 40.0, "banana", "sorbet");
	IShoppingList empty = new MTShoppingList();
	IShoppingList l2 = new ConsShoppingList(j1, new ConsShoppingList(c1, empty));
	IShoppingList all = new ConsShoppingList(i1,
			new ConsShoppingList(j1, new ConsShoppingList(c1, new MTShoppingList())));

	public void testHowMany() {
		assertEquals(empty.howMany(), 0);
		assertEquals(l2.howMany(), 2);
		assertEquals(all.howMany(), 3);
	}

	public void testHighestPrice() {
		assertEquals(empty.highestPrice(), 0.0);
		assertEquals(l2.highestPrice(), 25.0);
		assertEquals(all.highestPrice(), 40.0);
	}

	public void testBrandList() {
		assertEquals(empty.brandList(), new MTStringList());
		assertEquals(l2.brandList(),
				new ConsStringList("VinaJuice", new ConsStringList("Trung Nguyen", new MTStringList())));

	}
}

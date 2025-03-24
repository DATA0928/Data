package Ex5_9;

import junit.framework.TestCase;

public class InventoryTest extends TestCase {
	Toy doll = new Toy("doll", 17.95, 5);
	Toy robot = new Toy("robot", 22.05, 3);
	Toy gun = new Toy("gun", 15.0, 4);
	Inventory empty = new MTInventory();
	Inventory all = new ConsInventory(doll, new ConsInventory(robot, new ConsInventory(gun, new MTInventory())));

	public void testAverage() {
		assertEquals(empty.priceAverage(), 0.0);
		assertEquals(all.priceAverage(), 18.333, 0.001);
	}

	public void testReplaceName() {
		all.replaceName("robot", "r2d2");
		assertEquals(all, new ConsInventory(new Toy("doll", 17.95, 5), new ConsInventory(new Toy("r2d2", 22.05, 3),
				new ConsInventory(new Toy("gun", 15.0, 4), new MTInventory()))));

	}

	public void testEliminate() {
		assertEquals(all.eliminate("robot"),

				new ConsInventory(new Toy("doll", 17.95, 5),
						new ConsInventory(new Toy("gun", 15.0, 4), new MTInventory())));

	}
}

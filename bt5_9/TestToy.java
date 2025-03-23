package bt5_9;

import junit.framework.TestCase;

public class TestToy extends TestCase {

	Toy doll = new Toy("doll", 20.0, 30);
	Toy robot = new Toy("robot", 15.0, 20);
	Toy gun = new Toy("gun", 20.0, 10);

	Inventory empty = new MTInventory();
	Inventory a = new ConsInventory(gun, empty);
	Inventory b = new ConsInventory(robot, a);
	Inventory c = new ConsInventory(doll, b);

	Inventory all = new ConsInventory(doll, new ConsInventory(robot, new ConsInventory(gun, new MTInventory())));

	public void testdsgbdszbsgs() {
		System.out.println(all.toString());

		assertEquals(empty.averagePrice(), 0.0);
		assertEquals(a.averagePrice(), 20.0, 0.001);
		assertEquals(b.averagePrice(), 17.5, 0.001);
		assertEquals(c.averagePrice(), 18.333, 0.001);
	}

	public void testReplaceName() {
		all.replaceName("robot", "r2d2");
		assertEquals(all, new ConsInventory(new Toy("doll", 20.0, 30), new ConsInventory(new Toy("r2d2", 15.0, 20),
				new ConsInventory(new Toy("gun", 20.0, 10), new MTInventory()))));
	}

	public void testEliminate() {
		assertEquals(all.eliminate("robot"), new ConsInventory(new Toy("doll", 20.0, 30),
				new ConsInventory(new Toy("gun", 20.0, 10), new MTInventory())));

	}
}

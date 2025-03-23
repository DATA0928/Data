package VD;

import junit.framework.TestCase;

public class TestInventory extends TestCase {

	public void testConstructor() {
		Toy doll = new Toy("doll", 25, 6);
		Toy robot = new Toy("robot", 20, 10);
		Toy gun = new Toy("gun", 22, 8);

		Inventory empty = new MTInventory();
		Inventory i1 = new ConsInventory(gun, empty);
		Inventory i2 = new ConsInventory(robot, i1);
		Inventory i3 = new ConsInventory(doll, i2);
		System.out.println(i3);

		Inventory all = new ConsInventory(doll, new ConsInventory(robot, new ConsInventory(gun, empty)));
		System.out.println(all);
	}

}

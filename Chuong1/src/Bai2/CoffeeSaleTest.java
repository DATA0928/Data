package Bai2;

import junit.framework.TestCase;

public class CoffeeSaleTest extends TestCase {
		public void testConstructor() {
			new CoffeeSale("Hawaiian Kona", 15.95, 100);
			new CoffeeSale("Ethiopian", 8.0, 1000);
			new CoffeeSale("Colombian Supreme ", 9.5, 1700);
			}
		public void testCost() {
			assertEquals(
			new CoffeeSale("Hawaiian Kona", 15.95, 100).cost(), 1595.0);
			CoffeeSale c2 = new CoffeeSale("Ethiopian", 8.0, 1000);
			assertEquals(c2.cost(), 8000.0);
			CoffeeSale c3 = new CoffeeSale("Colombian Supreme ", 9.5, 1700);
			assertEquals(c3.cost(), 16150.0);
			}
		public void testPriceOver() {
			assertTrue(new CoffeeSale("Hawaiian Kona", 15.95, 100).priceOver(12));
			CoffeeSale c2 = new CoffeeSale("Ethiopian", 8.00, 1000);
			CoffeeSale c3 = new CoffeeSale("Colombian Supreme ", 9.50, 1700);
			assertFalse(c2.priceOver(12));
			assertFalse(c3.priceOver(12));
			}
}

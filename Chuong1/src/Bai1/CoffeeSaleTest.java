package Bai1;
import junit.framework.TestCase;

public class CoffeeSaleTest extends TestCase {
	public void testConstructor() {
		new CoffeeSale("Hawaiian Kona", 15.95, 100);
		new CoffeeSale("Ethiopian", 8.0, 1000);
		new CoffeeSale("Colombian Supreme ", 9.5, 1700);
		}
}

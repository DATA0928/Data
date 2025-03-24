package Bai2;

import junit.framework.TestCase;

public class StarTest extends TestCase {
	public void testConstructor() {
		new Star("Abba", "John", "vocals", 12200);
		new Star("Elton", "John", "guitar", 20000);
		new Star("Debie", "Gission", "organ", 15000);
		}
	public void testBiggerSales () {
		Star aStar1 = new Star("Abba", "John", "vocals", 12200);
		assertTrue(new Star("Elton", "John", "guitar", 20000).biggerSales(aStar1));
		assertFalse(aStar1.biggerSales(new Star("Debie", "Gission", "organ", 15000)));
		}
	public void testSame() {
		assertTrue(new Star("Abba", "John", "vocals", 12200).same(new Star("Abba", "John", "vocals", 12200)));
		Star aStar1 = new Star("Elton", "John", "guitar", 20000);
		assertTrue(aStar1.same(new Star("Elton", "John", "guitar", 20000)));
		Star aStar2 = new Star("Debie", "Gission", "organ", 15000);
		Star aStar3 = new Star("Debie", "Gission", "organ", 15000);
		assertFalse(aStar1.same(aStar2));
		assertTrue(aStar2.same(aStar3));
		}
	public void testEquals() {
		assertFalse(new Star("Abba", "John", "vocals", 12200).equals(new Star("Abba", "John", "vocals", 20000)));
		assertEquals(new Star("Elton", "John", "guitar", 20000), new Star("Elton", "John", "guitar", 20000));
		Star aStar1 = new Star("Debie", "Gission", "organ", 15000);
		Star aStar2 = new Star("Debie", "Gission", "organ", 15000);
		assertEquals(aStar1, aStar2);
		}
}

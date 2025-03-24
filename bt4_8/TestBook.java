package bt4_8;

import junit.framework.TestCase;

public class TestBook extends TestCase {
	public void testConstructor() {
		HardCoverBook A1=new HardCoverBook("fsdfgsg", "rgsrysrgser", 20, 2004);
		SaleBooks A2=new SaleBooks("fgdfhdfh", "dfgdfhgdsfhgs", 30, 1990);
		PaperPacks A3=new PaperPacks("dgsdgdhs","rgsrysrgser", 40, 1900);
		
		assertEquals(A1.salePrice(),16,0.001);
		assertEquals(A2.salePrice(),15,0.001);
		assertEquals(A3.salePrice(),40,0.001);
		
		assertTrue(A1.cheaperThan(A3));
		assertTrue(A2.cheaperThan(A3));
		assertFalse(A3.cheaperThan(A1));
		
		assertTrue(A1.sameAuthor(A3));
		assertFalse(A1.sameAuthor(A2));
		assertFalse(A2.sameAuthor(A3));
	}
}

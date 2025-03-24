package bt4_6;

import junit.framework.TestCase;

public class TestGrocery extends TestCase {
	public void testConstructor() {
		Coffee A1=new Coffee("djvkfgdfg", 10, 20,"regular");
		Coffee A2=new Coffee("djvkfg", 9, 15,"decaffeinated");
		Coffee A3=new Coffee("dfgdfg", 8, 12,"ssdfjshsd");
		IceCream B1=new IceCream("gjhvglk", 25, 40,"sorbet","d1");
		IceCream B2=new IceCream("gjhlk", 20, 30,"a frozen yogurt","d2");
		IceCream B3=new IceCream("gglk", 27, 45,"regular ice cream","d3");
		Juice C1=new Juice("fdhfdhdhdfrh", 35, 50.0, "gdfhdgfd","frozen");
		Juice C2=new Juice("fdhfddfrh", 30, 51.0, "gfd","fresh");
		Juice C3=new Juice("fdhfdrh", 45, 60.0, "gdfd","bottled");
		Juice C4=new Juice("fdh", 55, 70.5, "gddegsgsrdhdfshfd","canned");
		
		assertEquals(A1.unitPrice(),2.0,001);
		assertEquals(A2.unitPrice(),1.667,0.001);
		assertEquals(A3.unitPrice(),1.5,0.001);
		
		assertFalse(B1.lowerPrice(1.2));
		assertTrue(B2.lowerPrice(2.0));
		assertTrue(B3.lowerPrice(3.5));
		
		assertFalse(C1.cheaperThan(C4));
		assertFalse(C2.cheaperThan(C4));
		assertFalse(C3.cheaperThan(C4));
	}
}

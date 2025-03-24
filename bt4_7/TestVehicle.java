package bt4_7;

import junit.framework.TestCase;

public class TestVehicle extends TestCase {
	public void testConstructor() {
		Cab A1=new Cab(2424, 34, 5);
		Limo A2=new Limo(342352, 20, 5, 70);
		Van A3=new Van(43243, 35, 7,true);
		
		assertEquals(A1.fare(5),25.0,0.001);
		assertEquals(A2.fare(5),70,0.001);
		assertEquals(A3.fare(5),70.0,0.001);
		
		assertFalse(A1.lowerPrice(15, 30));
		assertFalse(A2.lowerPrice(35, 70));
		assertFalse(A3.lowerPrice(15, 30));
		
		assertFalse(A1.cheaperThan(20,A1));
		assertFalse(A2.cheaperThan(20,A1));
		assertFalse(A3.cheaperThan(20,A1));
		
	}
 }

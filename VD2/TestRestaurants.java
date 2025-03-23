package VD2;

import junit.framework.TestCase;

public class TestRestaurants extends TestCase {
	public void testConstructor() {
		Restaurants A1=new Restaurants("Chez Nous","French", "exp.", new Intersection(7, 65));
		Restaurants A2=new Restaurants("Das Bier","German", "cheap", new Intersection(2, 86));
		Restaurants A3=new Restaurants("Sun","Chinese", "cheap", new Intersection(10, 13));
		
		IRestaurants empty=new MTRestaurants();
		IRestaurants l1=new ConsRestaurants(A3,empty);
		IRestaurants l2=new ConsRestaurants(A2,l1);
		IRestaurants l3=new ConsRestaurants(A1,l2);
		System.out.println(l3);
		assertEquals(l3,l3);
	}
}

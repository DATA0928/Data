package bt5_7;

import junit.framework.TestCase;

public class TestList extends TestCase {
	public void testConstructor() {
		AnItem A1=new Coffee("vszdszgxdzzsx",25,70,"gdjcknbhf,cc");
		AnItem A2=new IceCream("vsxdzsx",15,40,"gdjckfnhfbchhf,cc","dgxffxf");
		AnItem A3=new Juice("vgzsx",5,20,"gdjcxfhdhhxdknbhf,cc","dgxdgsgsz");
		
		IShoppingList empty=new MTShoppingList();
		IShoppingList a=new ConsShoppingList(A3, empty);
		IShoppingList b=new ConsShoppingList(A2, a);
		IShoppingList c=new ConsShoppingList(A1, b);
		System.out.println(c);
		
		assertEquals(a.howMany(),1);
		assertEquals(b.howMany(),2);
		assertEquals(c.howMany(),3);

		assertEquals(a.highestPrice(),20.0);
		assertEquals(b.highestPrice(),40.0);
		assertEquals(c.highestPrice(),70.0);
		
		assertEquals(empty.brandList(),new MTStringList());
		assertEquals(a.brandList(),new ConsStringList("vgzsx",new MTStringList()));
		assertEquals(b.brandList(),new ConsStringList("vsxdzsx",new ConsStringList("vgzsx",new MTStringList())));
		
	}
}

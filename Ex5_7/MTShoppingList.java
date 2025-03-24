package Ex5_7;

public class MTShoppingList implements IShoppingList {
	public int howMany() {
		return 0;
	}

	public double highestPrice() {
		return 0.0;
	}

	public IStringList brandList() {
		return new MTStringList();
	}
}

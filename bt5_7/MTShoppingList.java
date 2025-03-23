package bt5_7;

public class MTShoppingList implements IShoppingList {

	@Override
	public int howMany() {

		return 0;
	}

	@Override
	public double highestPrice() {

		return 0;
	}

	@Override
	public IStringList brandList() {

		return new MTStringList();
	}

	@Override
	public String toString() {
		return "";
	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof MTShoppingList))
			return false;
		return true;

	}
}

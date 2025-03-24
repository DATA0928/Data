package Ex5_7;

public class ConsShoppingList implements IShoppingList {
	private AnItem first;
	private IShoppingList rest;

	public int howMany() {
		return 1 + this.rest.howMany();
	}

	public double highestPrice() {
		return Math.max(this.first.getPrice(), this.rest.highestPrice());
	}

	public IStringList brandList() {
		return new ConsStringList(this.first.getBranchName(), this.rest.brandList());
	}
}

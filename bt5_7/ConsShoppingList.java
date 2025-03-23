package bt5_7;

public class ConsShoppingList implements IShoppingList {
	private AnItem first;
	private IShoppingList rest;

	public ConsShoppingList(AnItem first, IShoppingList rest) {
		super();
		this.first = first;
		this.rest = rest;
	}

	public AnItem getFirst() {
		return first;
	}

	public void setFirst(AnItem first) {
		this.first = first;
	}

	public IShoppingList getRest() {
		return rest;
	}

	public void setRest(IShoppingList rest) {
		this.rest = rest;
	}

	@Override
	public int howMany() {

		return 1 + this.rest.howMany();
	}

	@Override
	public double highestPrice() {

		return Math.max(this.first.getPrice(), this.rest.highestPrice());

	}

	@Override
	public IStringList brandList() {

		return new ConsStringList(this.first.getBrandName(), this.rest.brandList());
	}

	@Override
	public String toString() {
		return this.first.toString() + "\n" + this.rest.toString();
	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof ConsShoppingList))
			return false;
		else {
			ConsShoppingList that = (ConsShoppingList) obj;
			return this.first.equals(that.first) && this.rest.equals(that.rest);
		}
	}
}

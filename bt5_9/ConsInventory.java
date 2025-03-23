package bt5_9;

public class ConsInventory implements Inventory {
	private Toy first;
	private Inventory rest;

	public ConsInventory(Toy first, Inventory rest) {
		super();
		this.first = first;
		this.rest = rest;
	}

	public Toy getFirst() {
		return first;
	}

	public void setFirst(Toy first) {
		this.first = first;
	}

	public Inventory getRest() {
		return rest;
	}

	public void setRest(Inventory rest) {
		this.rest = rest;
	}

	public double priceTotal() {
		return this.first.getPrice() + this.rest.priceTotal();
	}

	@Override
	public double averagePrice() {

		return this.priceTotal() / this.howMany();
	}

	@Override
	public int howMany() {

		return 1 + this.rest.howMany();
	}

	@Override
	public void replaceName(String oldName, String newName) {
		if (this.first.isName(oldName))
			this.first.setName(newName);
		this.rest.replaceName(oldName, newName);

	}

	@Override
	public Inventory eliminate(String toyName) {
		if (this.first.isName(toyName))
			return this.rest.eliminate(toyName);
		return new ConsInventory(this.first,this.rest.eliminate(toyName));
	}

	public String toString() {
		return this.first.toString() + "\n" + this.rest.toString();
	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof ConsInventory))
			return false;
		else {
			ConsInventory that = (ConsInventory) obj;
			return this.first.equals(that.first) && this.rest.equals(that.rest);
		}
	}
}

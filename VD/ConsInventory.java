package VD;

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
	public String toString() {
		return this.first.toString() +"\n" + this.rest.toString();
	}
}
	
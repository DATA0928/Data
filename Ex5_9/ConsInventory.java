package Ex5_9;

public class ConsInventory implements Inventory {
	public double priceTotal() {
		return this.first.getPrice() + this.rest.priceTotal();
	}

	public double priceAverage() {
		return this.priceTotal() / this.howMany();
	}

	public void replaceName(String oldName, String newName) {
		if (this.first.isName(oldName))
			this.first.setName(newName);
		this.rest.replaceName(oldName, newName);
	}

	public Inventory eliminate(String toyName) {
		if (this.first.isName(toyName))
			return this.rest.eliminate(toyName);
		return new ConsInventory(this.first, this.rest.eliminate(toyName));

	}
}

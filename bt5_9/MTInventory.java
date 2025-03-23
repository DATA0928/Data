package bt5_9;

public class MTInventory implements Inventory {

	@Override
	public double averagePrice() {

		return 0;
	}

	@Override
	public int howMany() {

		return 0;
	}

	public double priceTotal() {
		return 0;
	}

	@Override
	public void replaceName(String oldName, String newName) {

	}

	@Override
	public Inventory eliminate(String toyName) {
		return new MTInventory();

	}

	public String toString() {
		return "";

	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof MTInventory))
			return false;
		return true;

	}
}

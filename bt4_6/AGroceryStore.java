package bt4_6;

public abstract class AGroceryStore implements IGroceryStore {
	private String brandName;
	private double weight;
	private double price;

	public AGroceryStore(String brandName, double weight, double price) {
		super();
		this.brandName = brandName;
		this.weight = weight;
		this.price = price;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double unitPrice() {
		return this.price / this.weight;
	}

	public boolean lowerPrice(double amount) {
		return this.unitPrice() < amount;

	}

	public boolean cheaperThan(AGroceryStore that) {
		return this.unitPrice() < that.unitPrice();
	}
}

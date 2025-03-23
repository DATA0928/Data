package bt5_7;

public abstract class AnItem {
	private String brandName;
	private double weight;
	private double price;

	public AnItem(String brandName, double weight, double price) {
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

	@Override
	public String toString() {
		return "AnItem [brandName=" + brandName + ", weight=" + weight + ", price=" + price + "]";
	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof AnItem))
			return false;
		else {
			AnItem that = (AnItem) obj;
			return this.brandName.equals(that.brandName) && this.weight == that.weight && this.price == that.price;
		}
	}
}

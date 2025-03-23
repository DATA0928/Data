package bt5_9;

public class Toy {
	private String name;
	private double price;
	private int available;

	public Toy(String name, double price, int available) {
		super();
		this.name = name;
		this.price = price;
		this.available = available;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getAvailable() {
		return available;
	}

	public void setAvailable(int available) {
		this.available = available;
	}

	public boolean isName(String oldName) {
		return this.name.equals(oldName);
	}

	public String toString() {
		return "name:" + this.name + "," + this.price + "," + this.available;
	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Toy))
			return false;
		else {
			Toy that = (Toy) obj;
			return this.name.equals(that.name) && this.price == that.price && this.available == that.available;
		}
	}
}

package bt4_6;

public class Coffee extends AGroceryStore {
	private String label;

	public Coffee(String brandName, double weight, double price, String label) {
		super(brandName, weight, price);
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Coffee))
			return false;
		else {
			Coffee that = (Coffee) obj;
			return this.label.equals(that.label);

		}
	}
}

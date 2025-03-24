package Ex5_7;

public class IceCream extends AnItem {
	private String flavor;
	private String type;

	public IceCream(String branchName, double weight, double price, String flavor, String type) {
		super(branchName, weight, price);
		this.flavor = flavor;
		this.type = type;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
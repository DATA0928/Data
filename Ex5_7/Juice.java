package Ex5_7;

public class Juice extends AnItem {
	private String flavors;
	private String packaged;

	public Juice(String branchName, double weight, double price, String flavors, String packaged) {
		super(branchName, weight, price);
		this.flavors = flavors;
		this.packaged = packaged;
	}

	public String getFlavors() {
		return flavors;
	}

	public void setFlavors(String flavors) {
		this.flavors = flavors;
	}

	public String getPackaged() {
		return packaged;
	}

	public void setPackaged(String packaged) {
		this.packaged = packaged;
	}
}

package Ex4_6;

public class Juice extends AnItem {
	private String flavor;
	private String packages;

	public Juice(String branchName, double weight, double price, String flavor, String packages) {
		super(branchName, weight, price);
		this.flavor = flavor;
		this.packages = packages;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public String getPackages() {
		return packages;
	}

	public void setPackages(String packages) {
		this.packages = packages;
	}
}

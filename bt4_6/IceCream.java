package bt4_6;

public class IceCream extends AGroceryStore {
	private String flavor;
	private String Package;

	public IceCream(String brandName, double weight, double price, String flavor, String Package) {
		super(brandName, weight, price);
		this.flavor = flavor;
		this.Package = Package;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public String getPackage() {
		return Package;
	}

	public void setPackage(String Package) {
		this.Package = Package;
	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof IceCream))
			return false;
		else {
			IceCream that = (IceCream) obj;
			return this.flavor.equals(that.flavor) && this.Package.equals(that.Package);

		}
	}
}

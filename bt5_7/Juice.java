package bt5_7;

public class Juice extends AnItem {
	private String flavor;
	private String Package;

	public Juice(String brandName, double weight, double price, String flavor, String package1) {
		super(brandName, weight, price);
		this.flavor = flavor;
		Package = package1;
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

	public void setPackage(String package1) {
		Package = package1;
	}

	@Override
	public String toString() {
		return "Juice [flavor=" + flavor + ", Package=" + Package + "]";
	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Juice))
			return false;
		else {
			Juice that = (Juice) obj;
			return this.flavor.equals(that.flavor) && this.Package.equals(that.Package);
		}
	}
}

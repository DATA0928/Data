package VD2;

public class Intersection {
	private int avenue;
	private int street;

	public Intersection(int avenue, int street) {
		super();
		this.avenue = avenue;
		this.street = street;
	}

	public int getAvenue() {
		return avenue;
	}

	public void setAvenue(int avenue) {
		this.avenue = avenue;
	}

	public int getStreet() {
		return street;
	}

	public void setStreet(int street) {
		this.street = street;
	}

	public boolean equuals(Object obj) {
		if (obj == null || !(obj instanceof Intersection))
			return false;
		else {
			Intersection that = (Intersection) obj;
			return this.avenue == that.avenue && this.street == that.street;

		}
	}
}

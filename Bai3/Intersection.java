package Bai3;

public class Intersection {
	private int avenue;
	private int street;

	public Intersection(int avenue, int street) {
		this.avenue = avenue;
		this.street = street;
	}

	// is this intersection close to another
	public boolean closeTo(Intersection that) {
		return (Math.abs(this.avenue - that.avenue) <= 1) && (Math.abs(this.street - that.street) <= 1);
	}
}

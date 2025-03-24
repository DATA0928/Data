package Bai3;

public class Rectangle {
	private CartPt location;
	private int width;
	private int height;

	public Rectangle(CartPt location, int width, int height) {
		this.location = location;
		this.width = width;
		this.height = height;
	}

	// to compute the distance of this Rectangle to the origin
	public double distanceToO() {
		return this.location.distanceToO();
	}

	public double distanceFromCenterToO() {
		int xc = this.location.getX() + this.width / 2;
		int yc = this.location.getY() + this.height / 2;
		return Math.sqrt(xc * xc + yc * yc);
		// delegate distanceTYoO to the CartPt
		// return new CartPt(xc, yc).distanceToO();
	}

	// determine the center of this point
	public CartPt center() {
		return this.location.translate(this.width/2, this.height/2);
	}
}

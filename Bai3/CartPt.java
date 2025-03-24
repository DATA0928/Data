package Bai3;

public class CartPt {
	private int x;
	private int y;

	CartPt(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// to compute the distance of this CartPt to the origin
	public double distanceToO() {
		return Math.sqrt(this.x * this.x + this.y * this.y);
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public CartPt translate(int dx, int dy) {
		return new CartPt(this.x + dx, this.y + dy);
	}

	public boolean equals(Object obj) {
		if (null == obj || !(obj instanceof CartPt))
			return false;
		else {
			CartPt that = (CartPt) obj;
			return (this.x == that.x) && (this.y == that.y);

		}
	}
}

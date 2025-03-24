package bai4_1;

public class CartPt {
	private int x;
	private int y;

	public CartPt(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	// to compute the distance of this CartPt to the origin
	public double distanceToO() {
		return Math.sqrt(this.x * this.x + this.y * this.y);
	}

	// compute distance of this point to another point
	public double distanceTo(CartPt that) {
		double diffX = this.x - that.x;
		double diffY = this.y - that.y;
		return Math.sqrt(diffX * diffX + diffY * diffY);
	}

	// translate this point to dX, dY distance
	public CartPt translate(int dX, int dY) {
		return new CartPt(this.x + dX, this.y + dY);
	}

	public boolean equals(Object obj) {
		if (null==obj || !(obj instanceof CartPt))
		return false;
		else {
		CartPt that = (CartPt) obj;
		return (this.x == that.x) && (this.y == that.y);
		}
	}
}
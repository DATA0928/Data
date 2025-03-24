package BT4_4;

public class CartPt {
	private int x;
	private int y;

	public CartPt(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public double distanceToO() {
		return Math.sqrt(this.x * this.x + this.y * this.y);
	}

	public double distanceTo(CartPt that) {
		double diffx = this.x - that.x;
		double diffy = this.y - that.y;
		return Math.sqrt(diffx * diffx + diffy * diffy);
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

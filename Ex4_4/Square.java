package Ex4_4;

public class Square extends AShape {
	private int size;

	public Square(CartPt location, int size) {
		this.location = location;
		this.size = size;
	}

	public double area() {
		return this.size * this.size;
	}

	public double distanceToO() {
		return this.location.distanceToO();
	}

	public boolean contains(CartPt point) {
		int nwx = this.location.getX();
		int nwy = this.location.getY();
		int px = point.getX();
		int py = point.getX();
		// return (px >= nwx && px <= nwx + this.size)
		// && (py >= nwy && py <= nwy + this.size);
		return this.between(px, nwx, nwx + this.size) && this.between(py, nwy, nwy + this.size);

	}

	// -----------------------------------------------------------
	private boolean between(int value, int low, int high) {
		return (low <= value) && (value <= high);
	}

	public Rectangle boundingBox() {
		return new Rectangle(this.location, this.size, this.size);
	}

	public boolean equals(Object obj) {
		if (null == obj || !(obj instanceof Square))
			return false;
		else {
			Square that = (Square) obj;
			return (this.location.equals(that.location) && this.size == that.size);
		}
	}

	public double perimeter() {
		return this.size * 4;
	}
}

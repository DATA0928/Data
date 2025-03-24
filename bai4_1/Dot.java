package bai4_1;

public class Dot extends AShape {
	private CartPt location;

	public Dot(CartPt location) {
		this.location = location;
	}

	public double area() {
		return 0.0;
	}

	public double distanceToO() {
		return this.location.distanceToO();
	}

	public boolean contains(CartPt point) {
		return this.location.distanceTo(point) == 0.0;
	}

	public Square boundingBox() {
		return new Square(this.location, 0);
	}
}

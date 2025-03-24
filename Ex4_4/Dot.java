package Ex4_4;

public class Dot extends AShape {
	public Dot(CartPt location) {
		this.location = location;
	}

	public double area() {
		return 0;
	}

	public double distanceToO() {
		return this.location.distanceToO();
	}

	public boolean contains(CartPt point) {
		return this.location.distanceTo(point) == 0.0;
	}

	public Rectangle boundingBox() {
		return new Rectangle(this.location, 0, 0);
	}

	public double perimeter() {
		return 1.0;
	}
}

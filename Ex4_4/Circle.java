package Ex4_4;

public class Circle extends AShape {
	private int radius;

	public Circle(CartPt location, int radius) {
		this.location = location;
		this.radius = radius;
	}

	public double area() {
		return Math.PI * this.radius * this.radius;
	}

	public double distanceToO() {
		return this.location.distanceToO();
	}

	public boolean contains(CartPt point) {
		return this.location.distanceTo(point) == 0.0;
	}

	// Delegation to center translate (-radius, -radius) offset
	public Rectangle boundingBox() {
		return new Rectangle(this.location.translate(-this.radius, -this.radius),2* this.radius, this.radius * 2);
	}
}
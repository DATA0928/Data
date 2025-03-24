package bai4_1;

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

	public boolean contains(CartPt location) {
		return this.location.distanceTo(location) <= this.radius;
	}

	// Delegation to center translate (-radius, -radius) offset
	public Square boundingBox() {
		return new Square(this.location.translate(-this.radius, -this.radius), this.radius * 2);
	}
}

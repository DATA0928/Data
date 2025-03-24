package BT4_4;

public class Circle extends AShape {
	private int radius;

	public Circle(CartPt location, int radius) {
		super(location);
		this.radius = radius;
	}

	public double area() {
		return (this.radius * this.radius * Math.PI);
	}

	public boolean contains(CartPt point) {
		return this.getLocation().distanceTo(point) <= this.radius;
	}

	public Rectangle boundingBox() {
		return new Rectangle(this.getLocation().translate(-this.radius, -this.radius), 2 * this.radius,
				2 * this.radius);
	}

	public double perimeter() {
		return this.radius * 2 * Math.PI;
	}
}

package Bai3;

public class Circle {
	private CartPt center;
	private int radius;

	public Circle(CartPt center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	public double distanceToO() {
		return this.center.distanceToO();
	}

	// Compute the perimeter of the circle
	public double perimeter() {
		return 2 * Math.PI * this.radius;
	}

	// Compute the area of the circle
	public double area() {
		return Math.PI * this.radius * this.radius;
	}

	// Compute the area of the ring
	public double area(int otherRadius) {
		double otherArea = Math.PI * otherRadius * otherRadius;
		return Math.abs(this.area() - otherArea);
	}

	public double area(Circle that) {
		return this.area() - that.area();
	}

}

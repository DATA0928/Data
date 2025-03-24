package Ex4_4;

public class Rectangle extends AShape {
	private int width;
	private int height;

	public Rectangle(CartPt location, int width, int height) {
		this.location = location;
		this.width = width;
		this.height = height;
	}

	public double area() {
		return this.width * this.height;
	}

	public double distanceToO() {
		return this.location.distanceToO();
	}

	public boolean contains(CartPt point) {
		int thisX = this.location.getX();
		int thisY = this.location.getY();
		return ShapeUtils.between(point.getX(), thisX, thisX + this.width)
				&& ShapeUtils.between(point.getY(), thisY, thisY + this.height);
	}

	public Rectangle boundingBox() {
		return new Rectangle(this.location, width, height);
	}

	public double perimeter() {
		return (this.width + this.height) * 2;
	}
}

package BT4_4;

public class Square extends AShape {
	private int size;

	public Square(CartPt location, int size) {
		super(location);
		this.size = size;
	}

	public double area() {
		return this.size * this.size;
	}

	public boolean contains(CartPt point) {
		int thisX = this.getLocation().getX();
		int thisY = this.getLocation().getY();
		return ShapeUtils.between(point.getX(), thisX, thisX + this.size)
				&& ShapeUtils.between(point.getY(), thisY, thisY + this.size);
	}

	public Rectangle boundingBox() {
		return new Rectangle(this.getLocation(), this.size, this.size);

	}

	public double perimeter() {
		return this.size * 4;
	}
}

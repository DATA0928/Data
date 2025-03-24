package BT4_4;

public class Rectangle extends AShape {
	private int width;
	private int height;

	public Rectangle(CartPt location, int width, int height) {
		super(location);
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double area() {
		return this.width * this.height;
	}

	public boolean contains(CartPt point) {
		int thisX = this.getLocation().getX();
		int thisY = this.getLocation().getY();
		return ShapeUtils.between(point.getX(), thisX, thisX + this.width)
				&& ShapeUtils.between(point.getY(), thisY, thisY + this.height);
	}

	public Rectangle boundingBox() {
		return new Rectangle(this.getLocation(), width, height);
	}

	public boolean equals(Object obj) {
		if (null == obj || !(obj instanceof Rectangle))
			return false;
		else {
			Rectangle that = (Rectangle) obj;
			return this.getLocation().equals(that.getLocation()) && this.height == that.height
					&& this.width == that.width;
		}
	}

	public double perimeter() {
		return (this.width + this.height) * 2;
	}
}

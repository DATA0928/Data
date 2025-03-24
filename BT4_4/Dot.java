package BT4_4;

public class Dot extends AShape{
	public Dot(CartPt location) {
		super(location);
	}

	public double area() {
		return 0.0;
	}

	public boolean contains(CartPt point) {
		return this.getLocation().distanceTo(point) == 0.0;
	}

	public Rectangle boundingBox() {
		return new Rectangle(this.getLocation(), 0, 0);
	}

	public double perimeter() {
		return 1.0;
	}
	
}

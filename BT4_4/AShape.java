package BT4_4;

public abstract class AShape implements IShape{
	private CartPt location;

	public AShape(CartPt location) {
		super();
		this.location = location;
	}

	public CartPt getLocation() {
		return location;
	}

	public void setLocation(CartPt location) {
		this.location = location;
	}

	public abstract double area();

	public double distanceToO() {
		return this.location.distanceToO();
	}

	public abstract boolean contains(CartPt point);

	public abstract Rectangle boundingBox();

	public abstract double perimeter();
}

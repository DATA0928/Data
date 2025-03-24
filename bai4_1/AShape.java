package bai4_1;

public abstract class AShape implements IShape {

	protected CartPt location;

	public abstract double area();

	public abstract double distanceToO();

	public abstract boolean contains(CartPt location);

	public abstract Square boundingBox();
}

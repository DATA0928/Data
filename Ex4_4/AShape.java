package Ex4_4;

public abstract class AShape implements IShape {
	protected CartPt location;
	
	public abstract double area();

	public abstract double distanceToO();

	public abstract boolean contains(CartPt point);

	public abstract Rectangle boundingBox();
}

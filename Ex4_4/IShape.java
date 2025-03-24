package Ex4_4;

public interface IShape {
	// compute area of a shape
		public double area();

		// to compute the distance of this shape to the origin
		public double distanceToO();

		// is the given point is within the bounds of this shape
		public boolean contains(CartPt point);
		
		// compute the bounding box for this shape
		public Rectangle boundingBox();
}

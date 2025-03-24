package Ex5_12;

public class CompositeShape implements IShape {
	private IShape top;
	private IShape bottom;

	public CompositeShape(IShape top, IShape bottom) {
		this.top = top;
		this.bottom = bottom;
	}

	public double distanceToO() {
		return Math.min(this.top.distanceToO(), this.bottom.distanceToO());
	}

	public boolean contains(CartPt point) {
		return this.top.contains(point) || this.bottom.contains(point);
	}

	public Rectangle boundingBox() {
		Rectangle bbTop = this.top.boundingBox();
		Rectangle bbBottom = this.bottom.boundingBox();
		int x1 = Math.min(bbTop.location.getX(), bbBottom.location.getX());
		int y1 = Math.min(bbTop.location.getY(), bbBottom.location.getY());
		int x2 = Math.max(bbTop.location.getX() + bbTop.getWidth(), bbBottom.location.getX() + bbBottom.getWidth());
		int y2 = Math.max(bbTop.location.getY() + bbTop.getHeight(), bbBottom.location.getY() + bbBottom.getHeight());
		return new Rectangle(new CartPt(x1, y1), x2 - x1, y2 - y1);

	}
}

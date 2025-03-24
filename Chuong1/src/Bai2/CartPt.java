package Bai2;

public class CartPt {
	int x;
	int y;
	CartPt(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// Computes how far this pixel is from the origin
	double distanceToO() {
	return Math.sqrt(this.x * this.x + this.y * this.y);
	}
	
	// Computes distance from this CartPt to another CartPt
	double distanceTo(CartPt that) {
	return Math.sqrt((that.x - this.x)*(that.x - this.x) + (that.y - this.y)*(that.y - this.y));
	}
}

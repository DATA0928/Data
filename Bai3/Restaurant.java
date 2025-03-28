package Bai3;

public class Restaurant {
	private String name;
	private String food;
	private String priceRange;
	private Intersection intersection;

	public Restaurant(String name, String food, String priceRange, Intersection intersection) {
		this.name = name;
		this.food = food;
		this.priceRange = priceRange;
		this.intersection = intersection;
	}

	public boolean closeTo(Restaurant that) {
		return this.intersection.closeTo(that.intersection);
	}

	@Override
	public String toString() {
		return "Restaurant [name=" + name + ", food=" + food + ", priceRange=" + priceRange + ", intersection="
				+ intersection + "]";
	}

}

package VD2;

public class Restaurants {
	private String name;
	private String food;
	private String priceRange;
	private Intersection intersection;

	public Restaurants(String name, String food, String priceRange, Intersection intersection) {
		super();
		this.name = name;
		this.food = food;
		this.priceRange = priceRange;
		this.intersection = intersection;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getPriceRange() {
		return priceRange;
	}

	public void setPriceRange(String priceRange) {
		this.priceRange = priceRange;
	}

	public Intersection getIntersection() {
		return intersection;
	}

	public void setIntersection(Intersection intersection) {
		this.intersection = intersection;
	}

	@Override
	public String toString() {
		return "Restaurants [name=" + name + ", food=" + food + ", priceRange=" + priceRange + ", intersection="
				+ intersection + "]";
	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Restaurants))
			return false;
		else {
			Restaurants that = (Restaurants) obj;
			return this.name.equals(that.name) && this.food.equals(that.food) && this.priceRange.equals(that.priceRange)
					&& this.intersection == that.intersection;

		}
	}
}

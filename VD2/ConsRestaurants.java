package VD2;

public class ConsRestaurants implements IRestaurants {
	private Restaurants first;
	private IRestaurants rest;

	public ConsRestaurants(Restaurants first, IRestaurants rest) {
		super();
		this.first = first;
		this.rest = rest;
	}

	public Restaurants getFirst() {
		return first;
	}

	public void setFirst(Restaurants first) {
		this.first = first;
	}

	public IRestaurants getRest() {
		return rest;
	}

	public void setRest(IRestaurants rest) {
		this.rest = rest;
	}

	@Override
	public String toString() {
		return "ConsRestaurants [first=" + first + ", rest=" + rest + "]";
	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof ConsRestaurants))
			return false;
		else {
			ConsRestaurants that = (ConsRestaurants) obj;
			return this.first.equals(that.first) && this.rest.equals(that.rest);

		}
	}
}

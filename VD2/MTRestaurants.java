package VD2;

public class MTRestaurants implements IRestaurants {
	public String toString() {
		return "";

	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof MTRestaurants))
			return false;
		return true;

	}
}

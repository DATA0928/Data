package bt4_7;

public class Cab extends ATaxiVehicle {

	public Cab(int idNumber, int passenger, int pricePerMile) {
		super(idNumber, passenger, pricePerMile);

	}

	@Override
	public double fare(double numberOfMiles) {

		return this.getPricePerMile() * numberOfMiles;

	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Cab))
			return false;
		else {
			Cab that = (Cab) obj;
			return this.equals(that);
		}
	}
}

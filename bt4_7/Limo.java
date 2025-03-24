package bt4_7;

public class Limo extends ATaxiVehicle {
	private int minRental;

	public Limo(int idNumber, int passenger, int pricePerMile, int minRental) {
		super(idNumber, passenger, pricePerMile);
		this.minRental = minRental;
	}

	public int getMinRental() {
		return minRental;
	}

	public void setMinRental(int minRental) {
		this.minRental = minRental;
	}

	@Override
	public double fare(double numberOfMiles) {
		if (this.getPricePerMile() * numberOfMiles < minRental)
			return this.minRental;
		else {
			return this.getPricePerMile() * numberOfMiles;
		}
	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Limo))
			return false;
		else {
			Limo that = (Limo) obj;
			return this.minRental == that.minRental;

		}
	}
}

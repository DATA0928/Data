package Ex4_7;

public class Limo extends ATaxiVehicle {
	private int minRental;

	public Limo(int idNum, int passengers, int pricePerMile, int minRental) {
		super(idNum, passengers, pricePerMile);
		this.minRental = minRental;
	}

	public double fare(double numberOfMiles) {
		if (this.pricePerMile * numberOfMiles < minRental)
			return this.minRental;
		else
			return this.pricePerMile * numberOfMiles;

	}
}

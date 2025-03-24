package Ex4_7;

public class Cab extends ATaxiVehicle {
	public Cab(int idNum, int passengers, int pricePerMile) {
		super(idNum, passengers, pricePerMile);
	}

	public double fare(double numberOfMiles) {
		return this.pricePerMile * numberOfMiles;
	}

}

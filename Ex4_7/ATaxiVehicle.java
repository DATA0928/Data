package Ex4_7;

public abstract class ATaxiVehicle {
	protected int idNum;
	protected int passengers;
	protected int pricePerMile;

	public ATaxiVehicle(int idNum, int passengers, int pricePerMile) {
		this.idNum = idNum;
		this.passengers = passengers;
		this.pricePerMile = pricePerMile;
	}

	public abstract double fare(double numberOfMiles);

	public boolean lowerPrice(double numberOfMiles, double amount) {
		return this.fare(numberOfMiles) < amount;
	}

	public boolean cheaperThan(double numberOfMiles, ATaxiVehicle that) {
		return this.fare(numberOfMiles) < that.fare(numberOfMiles);
	}
}

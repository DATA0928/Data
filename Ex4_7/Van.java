package Ex4_7;

public class Van extends ATaxiVehicle {
	private boolean access;

	public Van(int idNum, int passengers, int pricePerMile, boolean access) {
		super(idNum, passengers, pricePerMile);
		this.access = access;
	}

	public double fare(double numberOfMiles) {
		return this.pricePerMile * numberOfMiles + this.passengers;
	}

	public boolean isAccess() {
		return access;
	}

	public void setAccess(boolean access) {
		this.access = access;
	}
}

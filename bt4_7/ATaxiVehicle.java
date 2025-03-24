package bt4_7;

public abstract class ATaxiVehicle implements IVehicle {
	private int idNumber;
	private int passenger;
	private int pricePerMile;

	public ATaxiVehicle(int idNumber, int passenger, int pricePerMile) {
		super();
		this.idNumber = idNumber;
		this.passenger = passenger;
		this.pricePerMile = pricePerMile;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public int getPassenger() {
		return passenger;
	}

	public void setPassenger(int passenger) {
		this.passenger = passenger;
	}

	public int getPricePerMile() {
		return pricePerMile;
	}

	public void setPricePerMile(int pricePerMile) {
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

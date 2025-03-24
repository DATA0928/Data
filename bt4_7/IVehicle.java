package bt4_7;

public interface IVehicle {
	public double fare(double numberOfMiles);

	public boolean lowerPrice(double numberOfMiles, double amount);

	public boolean cheaperThan(double numberOfMiles, ATaxiVehicle that);
}

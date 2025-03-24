package bt4_3;

public class Bus extends AVehicle {
	private int numberOfPassengers;

	public Bus(double fuelTankVolume, double averageMilePerGallon, int numberOfPassengers) {
		super(fuelTankVolume, averageMilePerGallon);
		this.numberOfPassengers = numberOfPassengers;
	}

	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}

	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}

}

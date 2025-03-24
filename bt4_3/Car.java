package bt4_3;

public class Car extends AVehicle {
	private int numberOfPassengers;

	public Car(double fuelTankVolume, double averageMilePerGallon, int numberOfPassengers) {
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

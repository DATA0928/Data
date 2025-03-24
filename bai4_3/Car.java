package bai4_3;

public class Car extends AVehicle {
	private int nPassengers;

	public Car(double fuelTankVolume, double averageMilePerGallon, int nPassengers) {
		super(fuelTankVolume, averageMilePerGallon);
		this.nPassengers = nPassengers;
	}

	public double fuelConsumption() {
		return this.averageMilePerGallon * (1 – 0.1*this.nPassengers);

		}
}

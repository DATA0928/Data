package bai4_3;

public class Truck extends AVehicle {
	private double loadInTons;

	public Truck(double fuelTankVolume, double averageMilePerGallon, double loadInTons) {
		super(fuelTankVolume, averageMilePerGallon);
		this.loadInTons = loadInTons;
	}

	public double fuelConsumption() {
		return this.averageMilePerGallon * (1 – 0.05*this.loadInTons);

		}
}

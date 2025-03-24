package bai4_3;

public abstract class AVehicle implements IVehicles {
	protected double fuelTankVolume; // in gallons
	protected double averageMilePerGallon;

	protected AVehicle(double fuelTankVolume, double averageMilePerGallon) {
		this.fuelTankVolume = fuelTankVolume;
		this.averageMilePerGallon = averageMilePerGallon;
	}

	public double refuelCost(double costPerGallon) {
		return costPerGallon * this.fuelTankVolume;
	}

	public abstract double fuelConsumption();

	public double howFar(){
		return this.fuelTankVolume * this.fuelConsumption();
	}
}

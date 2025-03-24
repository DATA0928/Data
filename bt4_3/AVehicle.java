package bt4_3;

public class AVehicle implements IVehicle {
	private double fuelTankVolume;// in gallons
	private double averageMilePerGallon;

	public AVehicle(double fuelTankVolume, double averageMilePerGallon) {
		super();
		this.fuelTankVolume = fuelTankVolume;
		this.averageMilePerGallon = averageMilePerGallon;
	}

	public double getFuelTankVolume() {
		return fuelTankVolume;
	}

	public void setFuelTankVolume(double fuelTankVolume) {
		this.fuelTankVolume = fuelTankVolume;
	}

	public double getAverageMilePerGallon() {
		return averageMilePerGallon;
	}

	public void setAverageMilePerGallon(double averageMilePerGallon) {
		this.averageMilePerGallon = averageMilePerGallon;
	}

}

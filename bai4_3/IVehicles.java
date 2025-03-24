package bai4_3;

public interface IVehicles {
	// Compute how much it costs to refuel this vehicle
	// with empty fuel tank at the current fuel prices
	public double refuelCost(double costPerGallon);

	// compute the fuel consumption of this vehicle
	public double fuelConsumption();

	// compute how far this vehicle can go
	public double howFar();
}

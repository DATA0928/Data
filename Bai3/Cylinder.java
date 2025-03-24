package Bai3;

public class Cylinder {
	private Circle baseDisk;
	private int height;

	public Cylinder(Circle baseDisk, int height) {
		this.baseDisk = baseDisk;
		this.height = height;
	}

	// Compute the volume of the cylinder
	public double volume() {
		return this.baseDisk.area() * this.height;
	}

	// Compute the surface of the cylinder
	public double surface() {
		return this.baseDisk.perimeter() * this.height;
	}
}

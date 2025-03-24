package De01;

public class Specification {
	private double baseDiameter; // in cm
	private double height; // in cm
	public Specification(double baseDiameter, double height) {
		super();
		this.baseDiameter = baseDiameter;
		this.height = height;
	}
	public double volumn() {
		return Math.PI * this.baseDiameter/2 * this.baseDiameter/2 * this.height;
	}
}

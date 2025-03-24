package ahjb;

public class Specification {
	private double baseDiameter;
	private int height;

	public Specification(double baseDiameter, int height) {
		super();
		this.baseDiameter = baseDiameter;
		this.height = height;
	}

	public double getBaseDiameter() {
		return baseDiameter;
	}

	public void setBaseDiameter(double baseDiameter) {
		this.baseDiameter = baseDiameter;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double volumn() {
		return (Math.PI * Math.pow(this.baseDiameter / 2, 2) * this.height);
	}
}

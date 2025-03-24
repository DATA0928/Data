package bt4_7;

public class Van extends ATaxiVehicle {
	private boolean access;

	public Van(int idNumber, int passenger, int pricePerMile, boolean access) {
		super(idNumber, passenger, pricePerMile);
		this.access = access;
	}

	public boolean isAccess() {
		return access;
	}

	public void setAccess(boolean access) {
		this.access = access;
	}

	@Override
	public double fare(double numberOfMiles) {

		return (this.getPricePerMile() * numberOfMiles) + this.getPassenger();
	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Van))
			return false;
		else {
			Van that = (Van) obj;
			return this.access == that.access;

		}
	}
}

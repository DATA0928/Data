package bt5_5;

public class MTLog implements ILog {
	public String toString() {
		return "";
	}

	public double miles(int month, int year) {
		return 0;

	}

	@Override
	public double minDistance() {
		return 0;

	}

	@Override
	public double minHelper(double currentMin) {

		return currentMin;
	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof MTLog))
			return false;
		return true;
	}
}

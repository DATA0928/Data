package bt5_5;

public class ConsLog implements ILog {
	private Entry first;
	private ILog rest;

	public ConsLog(Entry first, ILog rest) {
		super();
		this.first = first;
		this.rest = rest;
	}

	public Entry getFirst() {
		return first;
	}

	public void setFirst(Entry first) {
		this.first = first;
	}

	public ILog getRest() {
		return rest;
	}

	public void setRest(ILog rest) {
		this.rest = rest;
	}

	public String toString() {
		return this.first.toString() +"\n" + this.rest.toString();
	}

	public double miles(int month, int year) {
		if (this.first.sameMonthInAYear(month, year))
			return this.first.getDistance() + this.rest.miles(month, year);
		else {
			return this.rest.miles(month, year);

		}
	}

	@Override
	public double minDistance() {
		return minHelper(this.first.getDistance());

	}

	@Override
	public double minHelper(double currentMin) {

		if (this.first.getDistance() < currentMin)
			return this.rest.minHelper(this.first.getDistance());
		else
			return this.rest.minHelper(currentMin);

	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof ConsLog))
			return false;
		else {
			ConsLog that = (ConsLog) obj;
			return this.first.equals(that.first) && this.rest.equals(that.rest);
		}
	}
}

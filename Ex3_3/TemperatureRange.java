package Ex3_3;

public class TemperatureRange {
	int low;
	int high;

	public TemperatureRange(int low, int high) {
		super();
		this.low = low;
		this.high = high;
	}

	public boolean within(TemperatureRange that) {
		return (this.low >= that.low) && (this.high <= that.high);
	}
}

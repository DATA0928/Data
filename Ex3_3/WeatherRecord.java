package Ex3_3;

public class WeatherRecord {
	private Date d;
	private TemperatureRange today;
	private TemperatureRange normal;
	private TemperatureRange record;
	private double precipitation;

	public WeatherRecord(Date d, TemperatureRange today, TemperatureRange normal, TemperatureRange record,
			double precipitation) {
		this.d = d;
		this.today = today;
		this.normal = normal;
		this.record = record;
		this.precipitation = precipitation;
	}

	public Date getD() {
		return d;
	}

	public void setD(Date d) {
		this.d = d;
	}

	public TemperatureRange getToday() {
		return today;
	}

	public void setToday(TemperatureRange today) {
		this.today = today;
	}

	public TemperatureRange getNormal() {
		return normal;
	}

	public void setNormal(TemperatureRange normal) {
		this.normal = normal;
	}

	public TemperatureRange getRecord() {
		return record;
	}

	public void setRecord(TemperatureRange record) {
		this.record = record;
	}

	public double getPrecipitation() {
		return precipitation;
	}

	public void setPrecipitation(double precipitation) {
		this.precipitation = precipitation;
	}

	public boolean withinRange() {
		return this.today.within(this.normal);
	}

	public boolean rainyDay(double thatPrecipitation) {
		return this.precipitation >= thatPrecipitation;
	}

	public boolean recordDay() {
		return !this.today.within(this.record);
	}
}

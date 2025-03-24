package Ex3_4;

import java.util.Objects;

public class Schedule {
	private ClockTime departure;
	private ClockTime arrive;

	public Schedule(ClockTime departure, ClockTime arrive) {
		this.departure = departure;
		this.arrive = arrive;
	}

	public ClockTime getDeparture() {
		return departure;
	}

	public void setDeparture(ClockTime departure) {
		this.departure = departure;
	}

	public ClockTime getArrive() {
		return arrive;
	}

	public void setArrive(ClockTime arrive) {
		this.arrive = arrive;
	}

	public int ThoiGian() {
		int soGio = this.arrive.getHour()*60 - this.departure.getHour()*60;
		int soPhut = Math.abs(this.arrive.getMinute() - this.departure.getMinute());
		if (this.arrive.getMinute() >= this.departure.getMinute()) {
			return Math.abs(soPhut + soGio);
		} else {
			return Math.abs(soGio - soPhut);
		}
	}

	public ClockTime ThoiGianDi() {
		return new ClockTime(this.ThoiGian()/60, this.ThoiGian()%60);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Schedule other = (Schedule) obj;
		return Objects.equals(arrive, other.arrive) && Objects.equals(departure, other.departure);
	}
}

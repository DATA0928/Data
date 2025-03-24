package Ex3_4;

public class Train {
	private Schedule schedule;
	private Route route;
	private boolean local;

	public Train(Schedule schedule, Route route, boolean local) {
		this.schedule = schedule;
		this.route = route;
		this.local = local;
	}

	public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	public boolean isLocal() {
		return local;
	}

	public void setLocal(boolean local) {
		this.local = local;
	}

	public boolean Check(String destination) {
		return this.route.Check(destination);
	}

	public ClockTime Departs() {
		return this.schedule.getDeparture();
	}

	public ClockTime ThoiGian() {
		return this.schedule.ThoiGianDi();
	}
}
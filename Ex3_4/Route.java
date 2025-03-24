package Ex3_4;

public class Route {
	private String origin;
	private String destination;

	public Route(String origin, String destination) {
		this.origin = origin;
		this.destination = destination;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public boolean Check(String thatDestination) {
		return this.destination.equals(thatDestination);

	}
}

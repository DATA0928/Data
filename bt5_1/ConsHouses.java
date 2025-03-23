package bt5_1;

public class ConsHouses implements IHouses {
	private House first;
	private IHouses rest;

	public ConsHouses(House first, IHouses rest) {
		super();
		this.first = first;
		this.rest = rest;
	}

	public House getFirst() {
		return first;
	}

	public void setFirst(House first) {
		this.first = first;
	}

	public IHouses getRest() {
		return rest;
	}

	public void setRest(IHouses rest) {
		this.rest = rest;
	}

	public String toString() {
		return this.first.toString() + "\n" + this.rest.toString();

	}
}

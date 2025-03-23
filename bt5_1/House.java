package bt5_1;

public class House {
	private String kind;
	private int numberOfRooms;
	private double askingPrice;
	private Address address;

	public House(String kind, int numberOfRooms, double askingPrice, Address address) {
		super();
		this.kind = kind;
		this.numberOfRooms = numberOfRooms;
		this.askingPrice = askingPrice;
		this.address = address;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	public double getAskingPrice() {
		return askingPrice;
	}

	public void setAskingPrice(double askingPrice) {
		this.askingPrice = askingPrice;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String toString() {
		return "House:" + this.kind + "," + this.numberOfRooms + "," + this.askingPrice + "," + this.address;

	}
}

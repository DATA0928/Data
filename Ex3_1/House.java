package Ex3_1;

public class House {
	private String kind;
	private int numberOfRooms;
	private Address address;
	private double askingPrice;

	public House(String kind, int numberOfRooms, Address address, double askingPrice) {
		this.kind = kind;
		this.numberOfRooms = numberOfRooms;
		this.address = address;
		this.askingPrice = askingPrice;
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

	public boolean hasMoreRooms(House that) {
		return this.numberOfRooms > that.numberOfRooms;

	}

	public boolean inThisCity(String city) {
		return this.address.inThisCity(city);
	}

	public boolean sameCity(House that) {
		return this.address.sameCity(that.address);
	}
}

package bt5_1;

public class Address {
	private String houseNumber;
	private String streetName;
	private String city;

	public Address(String houseNumber, String streetName, String city) {
		super();
		this.houseNumber = houseNumber;
		this.streetName = streetName;
		this.city = city;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String toString() {
		return "houseNumber:" + this.houseNumber + ",streetName:" + this.streetName + ",city:" + this.city;

	}
}

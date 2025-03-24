package Ex3_1;

public class Address {
	private String houseNumbers;
	private String street;
	private String city;

	public Address(String houseNumbers, String street, String city) {
		this.houseNumbers = houseNumbers;
		this.street = street;
		this.city = city;
	}

	public String getHouseNumbers() {
		return houseNumbers;
	}

	public void setHouseNumbers(String houseNumbers) {
		this.houseNumbers = houseNumbers;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean inThisCity(String thatCity) {
		return this.city.equals(thatCity);

	}

	public boolean sameCity(Address that) {
		return this.city.equals(that.city);

	}
}

package bt5_6;

public class PhoneRecord {
	private String name;
	private String phoneNumbers;

	public PhoneRecord(String name, String phoneNumbers) {
		super();
		this.name = name;
		this.phoneNumbers = phoneNumbers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(String phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public boolean sameNumbers(String number) {
		return this.phoneNumbers.equals(number);
	}

	public boolean sameNames(String name) {
		return this.name.equals(name);
	}

}

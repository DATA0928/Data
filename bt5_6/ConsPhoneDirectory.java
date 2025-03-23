package bt5_6;

public class ConsPhoneDirectory implements IPhoneDirectory {
	private PhoneRecord first;
	private IPhoneDirectory rest;

	public ConsPhoneDirectory(PhoneRecord first, IPhoneDirectory rest) {
		super();
		this.first = first;
		this.rest = rest;
	}

	public PhoneRecord getFirst() {
		return first;
	}

	public void setFirst(PhoneRecord first) {
		this.first = first;
	}

	public IPhoneDirectory getRest() {
		return rest;
	}

	public void setRest(IPhoneDirectory rest) {
		this.rest = rest;
	}

	@Override
	// which determines the name that goes with some given phone number and phone
	// directory.
	public String whoseNumbers(String number) {
		if (this.first.sameNumbers(number))
			return this.first.getName();
		return this.rest.whoseNumbers(number);
	}

	public String phoneNumbers(String name) {
		if (this.first.sameNames(name))
			return this.first.getPhoneNumbers();
		else {
			return this.rest.phoneNumbers(name);

		}
	}

}

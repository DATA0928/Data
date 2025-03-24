package Ex5_6;

public class ConsPhoneDirectory implements IPhoneDirectory {
	private PhoneRecord first;
	private IPhoneDirectory rest;

	public String whoseNumber(String number) {
		if (this.first.sameNumber(number))
			return this.first.name;
		else
			return this.rest.whoseNumber(number);
	}

	public String phoneNumber(String name) {
		if (this.first.sameName(name))
			return this.first.phone;
		else
			return this.rest.phoneNumber(name);
	}
}

package Ex5_6;

public interface IPhoneDirectory {
	// determines the name that goes with
	// some given phone number
	public String whoseNumber(String number);

	// determines the phone number that goes with
	// some given name
	public String phoneNumber(String name);
}

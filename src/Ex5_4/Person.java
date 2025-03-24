package Ex5_4;

public class Person {
	private String name;
	private int yearOfBirth;

	public Person(String name, int yearOfBirth) {
		this.name = name;
		this.yearOfBirth = yearOfBirth;
	}

	public String toString() {
		return "(" + this.name + "," + this.yearOfBirth + ")";
	}
}

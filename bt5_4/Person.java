package bt5_4;

public class Person {
	private String name;
	private int yearOfBirth;

	public Person(String name, int yearOfBirth) {
		super();
		this.name = name;
		this.yearOfBirth = yearOfBirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	public String toString() {
		return "name:"+this.name+","+this.yearOfBirth;
		
	}
}

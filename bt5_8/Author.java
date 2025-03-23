package bt5_8;

public class Author {
	private String name;
	private int birthYear;

	public Author(String name, int birthYear) {
		super();
		this.name = name;
		this.birthYear = birthYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public boolean sameAuthor(Author that) {
		return this.name.equals(that.name) && this.birthYear == that.birthYear;
	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Author))
			return false;
		else {
			Author that = (Author) obj;
			return this.name.equals(that.name) && this.birthYear == that.birthYear;
		}
	}
}
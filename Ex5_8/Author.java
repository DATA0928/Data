package Ex5_8;

public class Author {
	private String name;
	private int birthYear;

	public Author(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}

	public boolean sameAuthor(Author that) {
		return (this.name.equals(that.name)) && (this.birthYear == that.birthYear);

	}
}

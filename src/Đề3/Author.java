package Đề3;

public class Author {
	private String name;
	private int birthYear;
	public Author(String name, int birthYear) {
		super();
		this.name = name;
		this.birthYear = birthYear;
	}
	@Override
	public String toString() {
		return "Author [name=" + name + ", birthYear=" + birthYear + "]";
	}
	boolean isAuthor(String that) {
		return this.name.equals(that);
	}
}

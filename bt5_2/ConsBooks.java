package bt5_2;

public class ConsBooks implements IBooks {
	private Book first;
	private IBooks rest;

	public ConsBooks(Book first, IBooks rest) {
		super();
		this.first = first;
		this.rest = rest;
	}

	public Book getFirst() {
		return first;
	}

	public void setFirst(Book first) {
		this.first = first;
	}

	public IBooks getRest() {
		return rest;
	}

	public void setRest(IBooks rest) {
		this.rest = rest;
	}

	public String toString() {
		return this.first.toString() + "\n" + this.rest.toString();

	}
}

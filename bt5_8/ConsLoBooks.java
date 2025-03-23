package bt5_8;

public class ConsLoBooks implements ILoBooks {
	private Books first;
	private ILoBooks rest;

	public ConsLoBooks(Books first, ILoBooks rest) {
		super();
		this.first = first;
		this.rest = rest;
	}

	public Books getFirst() {
		return first;
	}

	public void setFirst(Books first) {
		this.first = first;
	}

	public ILoBooks getRest() {
		return rest;
	}

	public void setRest(ILoBooks rest) {
		this.rest = rest;
	}

	@Override
	public ILoBooks thisAuthor(Author author) {
		if (this.first.thisAuthor(author)) {
			return new ConsLoBooks(this.first, this.rest.thisAuthor(author));
		} else {
			return this.rest.thisAuthor(author);
		}
	}

	@Override
	public ILoBooks sortByTitle() {

		return this.rest.sortByTitle().insertInTitleOrder(this.first);
	}

	@Override
	public ILoBooks insertInTitleOrder(Books book) {
		if (book.isTitleBefore(this.first))
			return new ConsLoBooks(book, this);
		else {
			return new ConsLoBooks(this.first, this.rest.insertInTitleOrder(book));
		}
	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof ConsLoBooks))
			return false;
		else {
			ConsLoBooks that = (ConsLoBooks) obj;
			return this.first.equals(that.first) && this.rest.equals(that.rest);
		}
	}
}

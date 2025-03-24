package Ex5_8;

public class ConsLoBooks implements ILoBooks {
	private Book first;
	private ILoBooks rest;

	public ILoBooks thisAuthor(Author author) {
		if (this.first.thisAuthor(author))
			return new ConsLoBooks(this.first, this.rest.thisAuthor(author));
		return this.rest.thisAuthor(author);
	}

	public ILoBooks sortByTitle() {
		return this.rest.sortByTitle().insertInTitleOrder(this.first);

	}

	public ILoBooks insertInTitleOrder(Book book) {
		if (book.isTitleBefore(this.first))
			return new ConsLoBooks(book, this);
		return new ConsLoBooks(this.first, this.rest.insertInTitleOrder(book));

	}
}

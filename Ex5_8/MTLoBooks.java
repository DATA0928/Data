package Ex5_8;

public class MTLoBooks implements ILoBooks {
	public ILoBooks thisAuthor(Author author) {
		return new MTLoBooks();
	}

	public ILoBooks sortByTitle() {
		return new MTLoBooks();
	}

	public ILoBooks insertInTitleOrder(Book book) {
		return new ConsLoBooks(book, new MTLoBooks());
	}
}

package bt5_8;

public class MTLoBooks implements ILoBooks {

	@Override
	public ILoBooks thisAuthor(Author author) {

		return new MTLoBooks();
	}

	@Override
	public ILoBooks sortByTitle() {

		return new MTLoBooks();
	}

	@Override
	public ILoBooks insertInTitleOrder(Books book) {

		return new ConsLoBooks(book, new MTLoBooks());
	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof MTLoBooks))
			return false;
		return true;
	}
}

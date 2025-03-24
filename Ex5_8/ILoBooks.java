package Ex5_8;

public interface ILoBooks {
	// determine the list of books that
	// this author has authored
	public ILoBooks thisAuthor(Author author);

	// sorts lists of books by title
	public ILoBooks sortByTitle();

	public ILoBooks insertInTitleOrder(Book book);
}
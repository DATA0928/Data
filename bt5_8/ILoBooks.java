package bt5_8;

public interface ILoBooks {
	public ILoBooks thisAuthor(Author author);

	public ILoBooks sortByTitle();

	public ILoBooks insertInTitleOrder(Books book);
}

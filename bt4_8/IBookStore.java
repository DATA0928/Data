package bt4_8;

public interface IBookStore {
	public double salePrice();
	public boolean cheaperThan(ABook that);
	public boolean sameAuthor(ABook that);
}

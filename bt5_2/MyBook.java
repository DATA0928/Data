package bt5_2;

public class MyBook {
	private String title;
	private double price;
	private int yearsOfPublication;
	private String authorName;
	private MyFavoriteBook myfavoriteBook;

	public MyBook(String title, double price, int yearsOfPublication, String authorName,
			MyFavoriteBook myfavoriteBook) {
		super();
		this.title = title;
		this.price = price;
		this.yearsOfPublication = yearsOfPublication;
		this.authorName = authorName;
		this.myfavoriteBook = myfavoriteBook;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getYearsOfPublication() {
		return yearsOfPublication;
	}

	public void setYearsOfPublication(int yearsOfPublication) {
		this.yearsOfPublication = yearsOfPublication;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public MyFavoriteBook getMyfavoriteBook() {
		return myfavoriteBook;
	}

	public void setMyfavoriteBook(MyFavoriteBook myfavoriteBook) {
		this.myfavoriteBook = myfavoriteBook;
	}

	public String toString() {
		return "name:" + this.title + "," + this.price + "," + this.yearsOfPublication + ",authorName:"
				+ this.authorName+",favoriteBook:"+this.myfavoriteBook;
		

	}
}

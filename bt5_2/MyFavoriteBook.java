package bt5_2;

public class MyFavoriteBook {
	private String title;
	private String authorName;

	public MyFavoriteBook(String title, String authorName) {
		super();
		this.title = title;
		this.authorName = authorName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String toString() {
		return "name:" + this.title + ",authorName:" + this.authorName;

	}
}

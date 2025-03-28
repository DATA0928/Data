package Ex5_11;

public class Course {
	private int number;
	private String title;
	private int credits;

	public Course(int number, String title, int credits) {
		this.number = number;
		this.title = title;
		this.credits = credits;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	@Override
	public String toString() {
		return "Course [number=" + number + ", title=" + title + ", credits=" + credits + "]";
	}
	

}

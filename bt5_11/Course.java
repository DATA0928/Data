package bt5_11;

public class Course {
	private int numbers;
	private String title;
	private int credits;

	public Course(int numbers, String title, int credits) {
		super();
		this.numbers = numbers;
		this.title = title;
		this.credits = credits;
	}

	public int getNumbers() {
		return numbers;
	}

	public void setNumbers(int numbers) {
		this.numbers = numbers;
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

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Course))
			return false;
		else {
			Course that = (Course) obj;
			return this.numbers == that.numbers && this.title.equals(that.title) && this.credits == that.credits;
		}
	}
}

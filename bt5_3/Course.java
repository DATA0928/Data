package bt5_3;

public class Course {
	private String subjectNumbers;
	private String subjectName;
	private int credits;

	public Course(String subjectNumbers, String subjectName, int credits) {
		super();
		this.subjectNumbers = subjectNumbers;
		this.subjectName = subjectName;
		this.credits = credits;

	}

	public String getSubjectNumbers() {
		return subjectNumbers;
	}

	public void setSubjectNumbers(String subjectNumbers) {
		this.subjectNumbers = subjectNumbers;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public String toString() {
		return "subjectNumbers:" + this.subjectNumbers + ",subjectName:" + this.subjectName + "," + this.credits;

	}
}

package bt5_11;

public class GradeRecord {
	private Course course;
	private double grade;

	public GradeRecord(Course course, double grade) {
		super();
		this.course = course;
		this.grade = grade;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public double subTotal() {
		return this.grade * this.getCourse().getCredits();
	}

	public boolean hasGradeMuchMoreThan(GradeRecord that) {
		return this.grade > that.grade;
	}

	public boolean isGradeGreaterThan(double value) {
		return this.grade > value;

	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof GradeRecord))
			return false;
		else {
			GradeRecord that = (GradeRecord) obj;
			return this.course.equals(that.course) && this.grade == that.grade;
		}
	}

}

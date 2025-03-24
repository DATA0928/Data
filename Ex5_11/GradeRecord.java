package Ex5_11;

public class GradeRecord {
	private Course course;
	private double grade;

	public GradeRecord(Course course, double grade) {
		super();
		this.course = course;
		this.grade = grade;
	}

	public double subTotal() {
		return this.grade * this.getCredits();
	}

	public boolean hasGradebiggerthan(GradeRecord that) {
		return this.grade >= that.grade;
	}
}

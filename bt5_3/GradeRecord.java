package bt5_3;

public class GradeRecord {
	private Course course;
	private double grades;

	public GradeRecord(Course course, double grades) {
		super();
		this.course = course;
		this.grades = grades;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public double getGrades() {
		return grades;
	}

	public void setGrades(double grades) {
		this.grades = grades;
	}

	@Override
	public String toString() {
		return "GradeRecord [course=" + course + ", grades=" + grades + "]";
	}
	
}
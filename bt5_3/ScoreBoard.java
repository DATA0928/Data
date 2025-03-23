package bt5_3;

public class ScoreBoard {
	private String name;
	private String courses;
	private ILoGrades LoGrades;

	public ScoreBoard(String name, String courses, ILoGrades loGrades) {
		super();
		this.name = name;
		this.courses = courses;
		LoGrades = loGrades;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}

	public ILoGrades getLoGrades() {
		return LoGrades;
	}

	public void setLoGrades(ILoGrades loGrades) {
		LoGrades = loGrades;
	}

	public String toString() {
		return "name:" + this.name + ",course:" + this.courses + "," + this.LoGrades;

	}
}

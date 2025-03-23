package bt5_11;

public class ScoreBoard {
	private String name;
	private String classes;
	private ILoGrades iLoGrades;

	public ScoreBoard(String name, String classes, ILoGrades iLoGrades) {
		super();
		this.name = name;
		this.classes = classes;
		this.iLoGrades = iLoGrades;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClasses() {
		return classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}

	public ILoGrades getiLoGrades() {
		return iLoGrades;
	}

	public void setiLoGrades(ILoGrades iLoGrades) {
		this.iLoGrades = iLoGrades;
	}

	public int howmanyCredits() {
		return this.iLoGrades.howManyCredits();
	}

	public double averageGrade() {
		return this.iLoGrades.averageGrade();
	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof ScoreBoard))
			return false;
		else {
			ScoreBoard that = (ScoreBoard) obj;
			return this.name.equals(that.name) && this.classes.equals(that.classes)
					&& this.iLoGrades.equals(that.iLoGrades);
		}
	}
}

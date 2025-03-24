package Ex5_11;

public class ScoreBoard {
	private String name;
	private String classes;
	private ILoGrades loGrades;

	public ScoreBoard(String name, String classes, ILoGrades loGrades) {
		this.name = name;
		this.classes = classes;
		this.loGrades = loGrades;
	}

	@Override
	public String toString() {
		return "ScoreBoard [name=" + name + ", classes=" + classes + ", loGrades=" + loGrades + "]";
	}

}

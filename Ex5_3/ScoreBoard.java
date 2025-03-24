package Ex5_3;

public class ScoreBoard {
	private String name;
	private String classes;
	private ILoGrades loGrade;

	public ScoreBoard(String name, String classes, ILoGrades loGrade) {
		this.name = name;
		this.classes = classes;
		this.loGrade = loGrade;
	}
}

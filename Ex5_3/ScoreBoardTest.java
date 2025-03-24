package Ex5_3;

import junit.framework.TestCase;

public class ScoreBoardTest extends TestCase {
	public void testScoreBoard() {
		Course c1 = new Course(211, "Database Fundamentals", 3);
		Course c2 = new Course(220, "Basic Programing", 2);
		Course c3 = new Course(690, "Algorithms", 4);
		Course c4 = new Course(721, "Data Structure", 4);
		ILoGrades grades = new ConsLoGrades(new GradeRecord(c1, 7.5),
				new ConsLoGrades(new GradeRecord(c2, 5.0), new ConsLoGrades(new GradeRecord(c3, 7.0),
						new ConsLoGrades(new GradeRecord(c4, 8.0), new MTLoGrades()))));
		new ScoreBoard("Tran Van Hoa", "2020", grades);
	}
}

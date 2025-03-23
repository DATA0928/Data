package bt5_11;

import junit.framework.TestCase;

public class TestScore extends TestCase {
	Course c1 = new Course(211, "Database Fundamentals", 3);
	Course c2 = new Course(220, "Basic Programing", 2);
	Course c3 = new Course(690, "Algorithms", 4);
	Course c4 = new Course(721, "Data Structure", 4);
	GradeRecord g1 = new GradeRecord(c1, 7.5);
	GradeRecord g2 = new GradeRecord(c2, 5.0);
	GradeRecord g3 = new GradeRecord(c3, 7.0);
	GradeRecord g4 = new GradeRecord(c4, 8.0);
	ILoGrades empty = new MTLoGrades();
	ILoGrades l2 = new ConsLoGrades(g1, new ConsLoGrades(g2, empty));
	ILoGrades grades = new ConsLoGrades(new GradeRecord(c1, 7.5),
	new ConsLoGrades(new GradeRecord(c2, 5.0),
	new ConsLoGrades(new GradeRecord(c3, 7.0),
	new ConsLoGrades(new GradeRecord(c4, 8.0),
	new MTLoGrades()))));

	ScoreBoard scb = new ScoreBoard("Tran Thi Hoa", "2020", grades);
	public void testHowManyCredits() {
	assertEquals(empty.howManyCredits(), 0);
	assertEquals(l2.howManyCredits(), 5);
	assertEquals(grades.howManyCredits(), 13);
	}
	public void testGradeAverage() {
		assertEquals(scb.averageGrade(), 7.115, 0.001);
		}
		public void testSortByGradeDec() {
		assertEquals(l2.sortByGradeDec(), new ConsLoGrades(g1,
		new ConsLoGrades(g2, new MTLoGrades())));

		assertEquals(grades.sortByGradeDec(),
		new ConsLoGrades(g4, new ConsLoGrades(g1,
		new ConsLoGrades(g3, new ConsLoGrades(g2,
		new MTLoGrades())))));

		}
		public void testGreaterThanList() {
		assertEquals(empty.greaterThanList(6.0), new MTLoGrades());
		assertEquals(l2.greaterThanList(6.0),

		new ConsLoGrades(g1, new MTLoGrades()));

		assertEquals(grades.greaterThanList(6.0),

		new ConsLoGrades(g1, new ConsLoGrades(g3,
		new ConsLoGrades(g4, new MTLoGrades()))));

		}
}

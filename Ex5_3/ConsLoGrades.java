package Ex5_3;

public class ConsLoGrades implements ILoGrades {
	private GradeRecord first;
	private ILoGrades rest;

	public ConsLoGrades(GradeRecord first, ILoGrades rest) {
		this.first = first;
		this.rest = rest;
	}
	
}

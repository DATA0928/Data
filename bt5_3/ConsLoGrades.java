package bt5_3;

public class ConsLoGrades implements ILoGrades{
	private GradeRecord first;
	private ILoGrades rest;

	public ConsLoGrades(GradeRecord first, ILoGrades rest) {
		super();
		this.first = first;
		this.rest = rest;
	}

	public GradeRecord getFirst() {
		return first;
	}

	public void setFirst(GradeRecord first) {
		this.first = first;
	}

	public ILoGrades getRest() {
		return rest;
	}

	public void setRest(ILoGrades rest) {
		this.rest = rest;
	}
	public String toString() {
		return this.first.toString()+"\n" +this.rest.toString();
		
	}
}

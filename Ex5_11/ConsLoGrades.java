package Ex5_11;

public class ConsLoGrades implements ILoGrades {
	private GradeRecord first;
	private ILoGrades rest;

	public ConsLoGrades(GradeRecord first, ILoGrades rest) {
		this.first = first;
		this.rest = rest;
	}

	public int howmanyCredits() {
		return this.first.getCredits() + this.rest.howmanyCredits();
	}

	public double totalGrade() {
		return this.first.subTotal() + this.rest.totalGrade();
	}

	public double gradeAverage() {
		return this.totalGrade() / this.howmanyCredits();
	}

	public ILoGrades sortByGradeDec() {
		return this.rest.sortByGradeDec().insertInGradeOrder(this.first);
	}

	public ILoGrades insertInGradeOrder(GradeRecord gradeRecord) {
		if (gradeRecord.hasGradebiggerthan(this.first))
			return new ConsLoGrades(gradeRecord, this);
		else
			return new ConsLoGrades(this.first, this.rest.insertInGradeOrder(gradeRecord));
	}

	public ILoGrades greaterThanList(double value) {
		if (this.first.isGradeGreaterThan(value))
			return new ConsLoGrades(this.first, this.rest.greaterThanList(value));
		else
			return this.rest.greaterThanList(value);
	}
}
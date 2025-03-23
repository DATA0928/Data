package bt5_11;

public class ConsLoGrades implements ILoGrades {
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

	@Override
	public int howManyCredits() {

		return this.first.getCourse().getCredits() + this.rest.howManyCredits();
	}

	@Override
	public double averageGrade() {

		return this.gradeTotal() / this.howManyCredits();
	}

	@Override
	public double gradeTotal() {
		return this.first.subTotal() + this.rest.gradeTotal();

	}

	@Override
	public ILoGrades sortByGradeDec() {
		return this.rest.sortByGradeDec().insertInGradeOrder(this.first);
	}

	@Override
	public ILoGrades insertInGradeOrder(GradeRecord A) {
		if (A.hasGradeMuchMoreThan(this.first))
			return new ConsLoGrades(A, this);
		else
			return new ConsLoGrades(this.first, this.rest.insertInGradeOrder(A));

	}

	@Override
	public ILoGrades greaterThanList(double value) {
		if (this.first.isGradeGreaterThan(value))
			return new ConsLoGrades(this.first, this.rest.greaterThanList(value));
		return this.rest.greaterThanList(value);
	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof ConsLoGrades))
			return false;
		else {
			ConsLoGrades that = (ConsLoGrades) obj;
			return this.first.equals(that.first) && this.rest.equals(that.rest);
		}
	}

}

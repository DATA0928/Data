package Ex5_11;

public class MTLoGrades implements ILoGrades {
	public int howmanyCredits() {
		return 0;
	}

	public double totalGrade() {
		return 0;
	}

	public double gradeAverage() {
		return 0;
	}

	public ILoGrades sortByGradeDec() {
		return new MTLoGrades();
	}

	public ILoGrades insertInGradeOrder(GradeRecord h) {
		return new ConsLoGrades(h, new MTLoGrades());
	}

	public ILoGrades greaterThanList(double value) {
		return new MTLoGrades();
	}
}

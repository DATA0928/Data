package bt5_11;

public class MTLoGrades implements ILoGrades {

	@Override
	public int howManyCredits() {

		return 0;
	}

	@Override
	public double averageGrade() {

		return 0;
	}

	@Override
	public double gradeTotal() {

		return 0;
	}

	@Override
	public ILoGrades sortByGradeDec() {

		return new MTLoGrades();
	}

	@Override
	public ILoGrades insertInGradeOrder(GradeRecord A) {

		return new ConsLoGrades(A, new MTLoGrades());

	}

	@Override
	public ILoGrades greaterThanList(double value) {
		return new MTLoGrades();
	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof MTLoGrades))
			return false;
		return true;
	}
}

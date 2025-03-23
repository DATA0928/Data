package bt5_11;

public interface ILoGrades {
	public int howManyCredits();

	public double averageGrade();

	public double gradeTotal();

	public ILoGrades sortByGradeDec();

	public ILoGrades insertInGradeOrder(GradeRecord A);
	public ILoGrades greaterThanList(double value);
}

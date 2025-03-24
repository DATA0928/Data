package Ex5_11;

public interface ILoGrades {
	// tinh tong so tin chi danh sach nay
	public int howmanyCredits();

	// tinh tong diem trong danh sach nay
	public double totalGrade();

	// tinh diem trung binh cua danh sach nay
	public double gradeAverage();

	// sap xep danh sach theo diem trung binh giam dan
	public ILoGrades sortByGradeDec();

	public ILoGrades insertInGradeOrder(GradeRecord h);

	// tim cac muc diem lon hon gia tri value
	public ILoGrades greaterThanList(double value);
}

package tuan6_exam;

public interface IEmployee {
	public boolean isTeachingCourse(Course that);
	public int howManyEmployee();
	public IEmployee getLecturers (String courseName);
	public IEmployee insert(AEmployee e);
	public IEmployee sort();

}

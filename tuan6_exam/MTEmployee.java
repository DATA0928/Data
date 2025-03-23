package tuan6_exam;

public class MTEmployee implements IEmployee{

	public MTEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "";
	}

	@Override
	public boolean isTeachingCourse(Course that) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int howManyEmployee() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public IEmployee getLecturers(String courseName) {
		// TODO Auto-generated method stub
		return new MTEmployee();
	}
	public boolean equals(Object obj) {
		if(obj==null ||!(obj instanceof MTEmployee)) {
			return false;
		}else {
			return true;
			
		}
	}

	@Override
	public IEmployee insert(AEmployee e) {
		// TODO Auto-generated method stub
		return new ConsEmployee(e, new MTEmployee());
	}

	@Override
	public IEmployee sort() {
		// TODO Auto-generated method stub
		return new MTEmployee();
	}

}

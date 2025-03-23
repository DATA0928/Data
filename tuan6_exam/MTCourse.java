package tuan6_exam;

public class MTCourse implements ICourse{

	public MTCourse() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "";
	}

	@Override
	public boolean sameCourse(Course that) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean sameCourseNameL(String that) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean equals(Object obj) {
		if(obj==null ||!(obj instanceof MTCourse)) {
			return false;
		}else {
			return true;
			
		}
	}
}

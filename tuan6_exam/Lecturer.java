package tuan6_exam;

public class Lecturer extends AEmployee{
	private ICourse listCourses;

	public Lecturer(String eid, String name, String address, Date birthDate, double salaryUnit, double bonussRate,
			ICourse listCourses) {
		super(eid, name, address, birthDate, salaryUnit, bonussRate);
		this.listCourses = listCourses;
	}

	@Override
	public String toString() {
		return super.toString() + "Day mon: "+ listCourses.toString();
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Lecturer";
	}

	@Override
	public boolean checkCourse(Course that) {
		// TODO Auto-generated method stub
		return this.listCourses.sameCourse(that);
	}

	@Override
	public boolean checkSameNameCourse(String that) {
		// TODO Auto-generated method stub
		return this.listCourses.sameCourseNameL(that);
	}

	
	public boolean equals(Object obj) {
		if(obj==null ||!(obj instanceof Lecturer)) {
			return false;
		}else {
			Lecturer that = (Lecturer)obj;
			return super.equals(that)&&this.listCourses.equals(that.listCourses);
			
		}
	}
	

}

package tuan6_exam;

public class ConsCourses implements ICourse{
	private Course first;
	private ICourse rest;
	public ConsCourses(Course first, ICourse rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	@Override
	public String toString() {
		return first.toString() + "\t" + rest.toString();
	}
	@Override
	public boolean sameCourse(Course that) {
		// TODO Auto-generated method stub

		return this.first.sameCourse(that)|| this.rest.sameCourse(that);
	}
	@Override
	public boolean sameCourseNameL(String that) {
		// TODO Auto-generated method stub
		return this.first.sameCourseName(that)|| this.rest.sameCourseNameL(that);
	}
	
	public boolean equals(Object obj) {
		if(obj==null ||!(obj instanceof ConsCourses)) {
			return false;
		}else {
			ConsCourses that = (ConsCourses)obj;
			return this.first.equals(that.first)&&this.rest.equals(that.rest);
			
		}
	}
}

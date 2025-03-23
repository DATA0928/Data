package tuan6_exam;

public class Course {
	private int cid;
	private String courseName;
	private int hours;
	public Course(int cid, String courseName, int hours) {
		super();
		this.cid = cid;
		this.courseName = courseName;
		this.hours = hours;
	}
	@Override
	public String toString() {
		return courseName + " ("+cid+")";
	}
	
	public boolean sameCourse(Course that) {
		return this.cid==that.cid&& this.courseName.equals(that.courseName)&& this.hours==that.hours;
	}
	
	public boolean sameCourseName(String that) {
		return this.courseName.equals(that);
	}
	
	public boolean equals(Object obj) {
		if(obj==null ||!(obj instanceof Course)) {
			return false;
		}else {
			Course that = (Course)obj;
			return this.cid==that.cid&& this.courseName.equals(that.courseName)&& this.hours==that.hours;
			
		}
	}

}

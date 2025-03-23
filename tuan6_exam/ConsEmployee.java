package tuan6_exam;

public class ConsEmployee implements IEmployee {
	private AEmployee first;
	private IEmployee rest;
	public ConsEmployee(AEmployee first, IEmployee rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	@Override
	public String toString() {
		return first.toString() + "\n" + rest.toString()+"\n";
	}
	@Override
	public boolean isTeachingCourse(Course that) {
		// TODO Auto-generated method stub
		if(this.first.getType().equals("Lecturer")) {
			return this.first.checkCourse(that)||this.rest.isTeachingCourse(that);
		}else {
			return this.rest.isTeachingCourse(that);
		}
	}
	@Override
	public int howManyEmployee() {
		// TODO Auto-generated method stub
		return 1+this.rest.howManyEmployee();
	}
	@Override
	public IEmployee getLecturers(String courseName) {
		// TODO Auto-generated method stub
		//if(this.first.getType().equals("Lecturer")) {
			if(this.first.checkSameNameCourse(courseName)) {
				return new ConsEmployee(this.first, this.rest.getLecturers(courseName));
			}else {
				return this.rest.getLecturers(courseName);
			}
//		}
//		return this.rest.getLecturers(courseName);
	}
	
	
	public boolean equals(Object obj) {
		if(obj==null ||!(obj instanceof ConsEmployee)) {
			return false;
		}else {
			ConsEmployee that = (ConsEmployee)obj;
			return this.first.equals(that.first)&&this.rest.equals(that.rest);
			
		}
	}
	@Override
	public IEmployee insert(AEmployee e) {
		// TODO Auto-generated method stub
		if(this.first.greaterThat(e)) {
			return new ConsEmployee(e, this);
		}else {
			return new ConsEmployee(this.first, rest.insert(e));
		}
		
	}
	@Override
	public IEmployee sort() {
		// TODO Auto-generated method stub
		return this.rest.sort().insert(first);
	}

}

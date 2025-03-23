package tuan6_exam;

public class Staff extends AEmployee{
	private String department;

	public Staff(String eid, String name, String address, Date birthDate, double salaryUnit, double bonussRate,
			String department) {
		super(eid, name, address, birthDate, salaryUnit, bonussRate);
		this.department = department;
	}

	@Override
	public String toString() {
		return super.toString()+ department;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Staff";
	}

	@Override
	public boolean checkCourse(Course that) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkSameNameCourse(String that) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean equals(Object obj) {
		if(obj==null ||!(obj instanceof Staff)) {
			return false;
		}else {
			Staff that = (Staff)obj;
			return super.equals(that)&&this.department.equals(that.department);
			
		}
	}
}

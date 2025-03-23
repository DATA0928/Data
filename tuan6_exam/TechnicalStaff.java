package tuan6_exam;

public class TechnicalStaff extends AEmployee{
	private String field;

	public TechnicalStaff(String eid, String name, String address, Date birthDate, double salaryUnit, double bonussRate,
			String field) {
		super(eid, name, address, birthDate, salaryUnit, bonussRate);
		this.field = field;
	}

	@Override
	public String toString() {
		return super.toString() + field;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "TechnicalStaff";
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
		if(obj==null ||!(obj instanceof TechnicalStaff)) {
			return false;
		}else {
			TechnicalStaff that = (TechnicalStaff)obj;
			return super.equals(that)&&this.field.equals(that.field);
			
		}
	}

}

package tuan6_exam;

public abstract class AEmployee {
	private String eid;
	private String name;
	private String address;
	private Date birthDate;
	private double salaryUnit;
	private double bonussRate;
	public AEmployee(String eid, String name, String address, Date birthDate, double salaryUnit, double bonussRate) {
		super();
		this.eid = eid;
		this.name = name;
		this.address = address;
		this.birthDate = birthDate;
		this.salaryUnit = salaryUnit;
		this.bonussRate = bonussRate;
	}
	public abstract String getType ();
	
	
	public int birthYear () {
		return this.birthDate.getNam();
	}
	public abstract boolean checkSameNameCourse(String that);
	public abstract boolean checkCourse(Course that);
	public boolean greaterThat(AEmployee that) {
		return this.bonussRate<=that.bonussRate;
	}
	@Override
	public String toString() {
		return eid + ", " + name + ", " + address + ", " + birthDate
				+ ", " + salaryUnit + ", " + bonussRate+", ";
	}
	
	public boolean equals(Object obj) {
		if(obj==null ||!(obj instanceof AEmployee)) {
			return false;
		}else {
			AEmployee that = (AEmployee)obj;
			return this.eid.equals(that.eid)&& this.name.equals(that.name)&&this.address.equals(that.address)&&
					this.birthDate.equals(that.birthDate)&& this.salaryUnit==that.salaryUnit&&this.bonussRate==that.bonussRate;
		}
	}

}

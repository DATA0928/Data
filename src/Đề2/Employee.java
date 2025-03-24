package Đề2;

public abstract class Employee {
	protected int eid;
	protected String name;
	protected Date birthday;
	protected double salaryRate;

	public Employee(int eid, String name, Date birthday, double salaryRate) {
		this.eid = eid;
		this.name = name;
		this.birthday = birthday;
		this.salaryRate = salaryRate;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public abstract double salary();
	
}
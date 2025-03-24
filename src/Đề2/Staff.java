package Đề2;

public class Staff extends Employee {
	private String department;

	public Staff(int eid, String name, Date birthday, double salaryRate, String department) {
		super(eid, name, birthday, salaryRate);
		this.department = department;
	}
	public double salary() {
		return 1000000;
	}
}

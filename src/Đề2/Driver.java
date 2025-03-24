package Đề2;

public class Driver extends Employee {
	private ListVehicle vehicle;

	public Driver(int eid, String name, Date birthday, double salaryRate, ListVehicle vehicle) {
		super(eid, name, birthday, salaryRate);
		this.vehicle = vehicle;
	}
	
	public double salary() {
		return 900000;
	}
}

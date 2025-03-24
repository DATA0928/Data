package Đề2;

public class ListVehicle {
	private int iid;
	private String vehicalName;
	private int year;
	public ListVehicle(int iid, String vehicalName, int year) {
		this.iid = iid;
		this.vehicalName = vehicalName;
		this.year = year;
	}
	public int getIid() {
		return iid;
	}
	public void setIid(int iid) {
		this.iid = iid;
	}
	public String getVehicalName() {
		return vehicalName;
	}
	public void setVehicalName(String vehicalName) {
		this.vehicalName = vehicalName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}

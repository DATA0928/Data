package Đề2;

import junit.framework.TestCase;

public class EmployeeTest extends TestCase {
	ListVehicle x1 = new ListVehicle(101, "Xe tải", 2020);
	ListVehicle x2 = new ListVehicle(102, "Xe Khách", 2016);
	ListVehicle x3 = new ListVehicle(103, "Xe Bus", 2012);
	ListVehicle x4 = new ListVehicle(104, "Xe bán tải", 2010);
	Staff s1 = new Staff(101, "Le Nhan Minh", new Date(2, 8, 1994), 1.2, "Giao hàng");
	Staff s2 = new Staff(102, "Ai Nguyen", new Date(1, 1, 1989), 1.5, "Kế toán");
	Driver t1 = new Driver(201, "Ta Quang Phap", new Date(12, 5, 1989), 2.5, new ListVehicle(0, getName(), 0));
	Driver t2 = new Driver(202, "Thien Dinh", new Date(1, 9, 1989), 2.2, x1);
	Driver t3 = new Driver(203, "Tran Tuan Minh", new Date(12, 5, 1989), 2.2, x3);
	public void testgetBirthday() {
		
	}
}

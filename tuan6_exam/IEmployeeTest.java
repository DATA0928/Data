package tuan6_exam;

import java.security.Principal;

import junit.framework.TestCase;

public class IEmployeeTest extends TestCase{
	public void testContructor() {
		Date d1= new Date(11, 11, 1990);
		Date d2= new Date(20,10,2000);
		Staff s1= new Staff("501", "Ho Tan", "22 Thu Duc HCM",d1, 2000000.0, 1.5, "Nhan Su");
		Staff s2= new Staff("502", "Nguyen Nhu Quynh", "99 Quan 9 HCM", d2, 2000000.0, 1.7, "Ke Toan");
		
		Date d3= new Date(22, 10, 1987);
		Date d4= new Date(20,10,1990);
		TechnicalStaff st1= new TechnicalStaff("201", "Vo Xuan Hop", "44 Binh Thanh HCM", d3, 9000000.0, 2.7, "BaoTriXe");
		TechnicalStaff st2= new TechnicalStaff("301", "Ha Yen Nhi", "89 Quan 3 HCM", d4, 9000000.0, 2.5, "BaoTriThietBi");
		
		Date d5= new Date(22, 12, 1999);
		Date d6= new Date(22,12,1988);
		Date d7= new Date(12, 12, 1997);
		
		Course c1= new Course(101, "XeMoTo", 45);
		Course c2= new Course(102, "XeOTo", 45);
		Course c3= new Course(202, "XeContainer", 45);
		Course c4= new Course(201, "XeTai", 45);
		
		ICourse l1= new ConsCourses(c2, new MTCourse());
		ICourse l2=new ConsCourses(c1, l1);
		ICourse l3=new ConsCourses(c4, new ConsCourses(c3, l1));
		ICourse l4= new ConsCourses(c1, new ConsCourses(c3, l1));
		
		Lecturer lec1 = new Lecturer("201", "Nguyen Anh Khoa", "32 Dang Van Bi TP.ThuDuc Tp. HCM", d5, 5000000.0, 2,l2 );
		Lecturer lec2 = new Lecturer("202", "Vo Quang Huy", "19 Nguyen Xi Binh Thanh Tp. HCM", d6, 5000000.0, 2.5,l3);
		Lecturer lec3 = new Lecturer("203", "Nguyen Thanh Thang", "120 Nguyen Xi Binh Thanh Tp. HCM", d7, 5000000.0, 2.5,l4);
		
//		IEmployee all= new ConsEmployee(s1, new ConsEmployee(s2, new ConsEmployee(st1, new ConsEmployee(st2,  new ConsEmployee(lec1,  new ConsEmployee(lec2,
//				new ConsEmployee(lec3, new MTEmployee())))))));
//		System.out.println(all.toString());
	
	}
	public void testGetType() {
		Date d1= new Date(11, 11, 1990);
		Date d2= new Date(20,10,2000);
		Staff s1= new Staff("501", "Ho Tan", "22 Thu Duc HCM",d1, 2000000.0, 1.5, "Nhan Su");
		Staff s2= new Staff("502", "Nguyen Nhu Quynh", "99 Quan 9 HCM", d2, 2000000.0, 1.7, "Ke Toan");
		
		Date d3= new Date(22, 10, 1987);
		Date d4= new Date(20,10,1990);
		TechnicalStaff st1= new TechnicalStaff("201", "Vo Xuan Hop", "44 Binh Thanh HCM", d3, 9000000.0, 2.7, "BaoTriXe");
		TechnicalStaff st2= new TechnicalStaff("301", "Ha Yen Nhi", "89 Quan 3 HCM", d4, 9000000.0, 2.5, "BaoTriThietBi");
		
		Date d5= new Date(22, 12, 1999);
		Date d6= new Date(22,12,1988);
		Date d7= new Date(12, 12, 1997);
		
		Course c1= new Course(101, "XeMoTo", 45);
		Course c2= new Course(102, "XeOTo", 45);
		Course c3= new Course(202, "XeContainer", 45);
		Course c4= new Course(201, "XeTai", 45);
		
		ICourse l1= new ConsCourses(c2, new MTCourse());
		ICourse l2=new ConsCourses(c1, l1);
		ICourse l3=new ConsCourses(c4, new ConsCourses(c3, l1));
		ICourse l4= new ConsCourses(c1, new ConsCourses(c3, l1));
		
		Lecturer lec1 = new Lecturer("201", "Nguyen Anh Khoa", "32 Dang Van Bi TP.ThuDuc Tp. HCM", d5, 5000000.0, 2,l2 );
		Lecturer lec2 = new Lecturer("202", "Vo Quang Huy", "19 Nguyen Xi Binh Thanh Tp. HCM", d6, 5000000.0, 2.5,l3);
		Lecturer lec3 = new Lecturer("203", "Nguyen Thanh Thang", "120 Nguyen Xi Binh Thanh Tp. HCM", d7, 5000000.0, 2.5,l4);
//		
//		System.out.println(st1.getType());
//		assertEquals(s1.getType(), "Staff");
//		assertEquals(lec1.getType(), "Lecturer");
//		assertEquals(st1.getType(), "TechnicalStaff");
	
	}
	public void testBirthDate() {
		Date d1= new Date(11, 11, 1990);
		Date d2= new Date(20,10,2000);
		Staff s1= new Staff("501", "Ho Tan", "22 Thu Duc HCM",d1, 2000000.0, 1.5, "Nhan Su");
		Staff s2= new Staff("502", "Nguyen Nhu Quynh", "99 Quan 9 HCM", d2, 2000000.0, 1.7, "Ke Toan");
		
		Date d3= new Date(22, 10, 1987);
		Date d4= new Date(20,10,1990);
		TechnicalStaff st1= new TechnicalStaff("201", "Vo Xuan Hop", "44 Binh Thanh HCM", d3, 9000000.0, 2.7, "BaoTriXe");
		TechnicalStaff st2= new TechnicalStaff("301", "Ha Yen Nhi", "89 Quan 3 HCM", d4, 9000000.0, 2.5, "BaoTriThietBi");
		
		Date d5= new Date(22, 12, 1999);
		Date d6= new Date(22,12,1988);
		Date d7= new Date(12, 12, 1997);
		
		Course c1= new Course(101, "XeMoTo", 45);
		Course c2= new Course(102, "XeOTo", 45);
		Course c3= new Course(202, "XeContainer", 45);
		Course c4= new Course(201, "XeTai", 45);
		
		ICourse l1= new ConsCourses(c2, new MTCourse());
		ICourse l2=new ConsCourses(c1, l1);
		ICourse l3=new ConsCourses(c4, new ConsCourses(c3, l1));
		ICourse l4= new ConsCourses(c1, new ConsCourses(c3, l1));
		
		Lecturer lec1 = new Lecturer("201", "Nguyen Anh Khoa", "32 Dang Van Bi TP.ThuDuc Tp. HCM", d5, 5000000.0, 2,l2 );
		Lecturer lec2 = new Lecturer("202", "Vo Quang Huy", "19 Nguyen Xi Binh Thanh Tp. HCM", d6, 5000000.0, 2.5,l3);
		Lecturer lec3 = new Lecturer("203", "Nguyen Thanh Thang", "120 Nguyen Xi Binh Thanh Tp. HCM", d7, 5000000.0, 2.5,l4);
		
//		System.out.println(st1.getType());
//		assertEquals(s1.birthYear(), 1990);
//		assertEquals(lec1.birthYear(), 1999);
//		assertEquals(st1.birthYear(), 1987);
	
	}
	
	public void testIsTeachingCourse () {
		Date d1= new Date(11, 11, 1990);
		Date d2= new Date(20,10,2000);
		Staff s1= new Staff("501", "Ho Tan", "22 Thu Duc HCM",d1, 2000000.0, 1.5, "Nhan Su");
		Staff s2= new Staff("502", "Nguyen Nhu Quynh", "99 Quan 9 HCM", d2, 2000000.0, 1.7, "Ke Toan");
		
		Date d3= new Date(22, 10, 1987);
		Date d4= new Date(20,10,1990);
		TechnicalStaff st1= new TechnicalStaff("201", "Vo Xuan Hop", "44 Binh Thanh HCM", d3, 9000000.0, 2.7, "BaoTriXe");
		TechnicalStaff st2= new TechnicalStaff("301", "Ha Yen Nhi", "89 Quan 3 HCM", d4, 9000000.0, 2.5, "BaoTriThietBi");
		
		Date d5= new Date(22, 12, 1999);
		Date d6= new Date(22,12,1988);
		Date d7= new Date(12, 12, 1997);
		
		Course c1= new Course(101, "XeMoTo", 45);
		Course c2= new Course(102, "XeOTo", 45);
		Course c3= new Course(202, "XeContainer", 45);
		Course c4= new Course(201, "XeTai", 45);
		
		ICourse l1= new ConsCourses(c2, new MTCourse());
		ICourse l2=new ConsCourses(c1, l1);
		ICourse l3=new ConsCourses(c4, new ConsCourses(c3, l1));
		ICourse l4= new ConsCourses(c1, new ConsCourses(c3, l1));
		
		Lecturer lec1 = new Lecturer("201", "Nguyen Anh Khoa", "32 Dang Van Bi TP.ThuDuc Tp. HCM", d5, 5000000.0, 2,l2 );
		Lecturer lec2 = new Lecturer("202", "Vo Quang Huy", "19 Nguyen Xi Binh Thanh Tp. HCM", d6, 5000000.0, 2.5,l3);
		Lecturer lec3 = new Lecturer("203", "Nguyen Thanh Thang", "120 Nguyen Xi Binh Thanh Tp. HCM", d7, 5000000.0, 2.5,l4);
		
		IEmployee all= new ConsEmployee(s1, new ConsEmployee(s2, new ConsEmployee(st1, new ConsEmployee(st2,  new ConsEmployee(lec1,  new ConsEmployee(lec2,
				new ConsEmployee(lec3, new MTEmployee())))))));
//		System.out.println(st1.getType());
//		assertEquals(all.isTeachingCourse(c1), true);
//		assertEquals(new ConsEmployee(lec1, new MTEmployee()).isTeachingCourse(c4), false);
//	
	}
	
	public void testGetLecturers  () {
		Date d1= new Date(11, 11, 1990);
		Date d2= new Date(20,10,2000);
		Staff s1= new Staff("501", "Ho Tan", "22 Thu Duc HCM",d1, 2000000.0, 1.5, "Nhan Su");
		Staff s2= new Staff("502", "Nguyen Nhu Quynh", "99 Quan 9 HCM", d2, 2000000.0, 1.7, "Ke Toan");
		
		Date d3= new Date(22, 10, 1987);
		Date d4= new Date(20,10,1990);
		TechnicalStaff st1= new TechnicalStaff("201", "Vo Xuan Hop", "44 Binh Thanh HCM", d3, 9000000.0, 2.7, "BaoTriXe");
		TechnicalStaff st2= new TechnicalStaff("301", "Ha Yen Nhi", "89 Quan 3 HCM", d4, 9000000.0, 2.5, "BaoTriThietBi");
		
		Date d5= new Date(22, 12, 1999);
		Date d6= new Date(22,12,1988);
		Date d7= new Date(12, 12, 1997);
		
		Course c1= new Course(101, "XeMoTo", 45);
		Course c2= new Course(102, "XeOTo", 45);
		Course c3= new Course(202, "XeContainer", 45);
		Course c4= new Course(201, "XeTai", 45);
		
		ICourse l1= new ConsCourses(c2, new MTCourse());
		ICourse l2=new ConsCourses(c1, l1);
		ICourse l3=new ConsCourses(c4, new ConsCourses(c3, l1));
		ICourse l4= new ConsCourses(c1, new ConsCourses(c3, l1));
		
		Lecturer lec1 = new Lecturer("201", "Nguyen Anh Khoa", "32 Dang Van Bi TP.ThuDuc Tp. HCM", d5, 5000000.0, 2,l2 );
		Lecturer lec2 = new Lecturer("202", "Vo Quang Huy", "19 Nguyen Xi Binh Thanh Tp. HCM", d6, 5000000.0, 2.5,l3);
		Lecturer lec3 = new Lecturer("203", "Nguyen Thanh Thang", "120 Nguyen Xi Binh Thanh Tp. HCM", d7, 5000000.0, 2.5,l4);
		
		
		IEmployee all= new ConsEmployee(s1, new ConsEmployee(s2, new ConsEmployee(st1, new ConsEmployee(st2,  new ConsEmployee(lec1,  new ConsEmployee(lec2,
				new ConsEmployee(lec3, new MTEmployee())))))));
//		System.out.println("Before sort");
//		System.out.println(all.toString());
//		System.out.println("After sorted");
//		System.out.println(all.sort().toString());
		System.out.println("MOto");
		System.out.println(all.getLecturers("XeMoTo").toString());
		assertEquals(all.getLecturers("XeMoTo"), new ConsEmployee(lec1, new ConsEmployee(lec3, new MTEmployee())));
		assertEquals(new ConsEmployee(lec1, new MTEmployee()).isTeachingCourse(c4), false);
	}
}

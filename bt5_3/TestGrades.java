package bt5_3;

import junit.framework.TestCase;

public class TestGrades extends TestCase {
	public void testConstructor() {
		Course A1=new Course("211","Database Fundamentals",3);
		Course A2=new Course("220","Basic Programing",2);
		Course A3=new Course("690","Algorithms",4);
		Course A4=new Course("721","Data Structure",4);
		
		ILoGrades empty=new MTLoGrades();
		ILoGrades a=new ConsLoGrades(new GradeRecord(A4,7.5), empty);
		ILoGrades b=new ConsLoGrades(new GradeRecord(A3, 3.5), a);
		ILoGrades c=new ConsLoGrades(new GradeRecord(A2, 4.5), b);
		ILoGrades d=new ConsLoGrades(new GradeRecord(A1, 8.5), c);
		System.out.println(d.toString());
		
	}
}

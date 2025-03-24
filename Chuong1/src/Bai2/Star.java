package Bai2;

public class Star {
	String firstName;
	String lastName;
	String instrument;
	int sales;
	// contructor
	Star(String firstName, String lastName, String instrument, int sales) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.instrument = instrument;
	this.sales = sales;
	}
	// check whether this star�s sales is greater than
	// another star�s sales
	boolean biggerSales(Star other) {
	return (this.sales > other.sales);
	}
	// check whether this star is same another star
	boolean same(Star other) {
	return (this.firstName.equals(other.firstName)
	&& this.lastName.equals(other.lastName)
	&& this.instrument.equals(other.instrument)
	&& this.sales == other.sales);
	}
	
	public boolean equals(Object obj) {
		if (null == obj || !(obj instanceof Star))
		return false;
		else { Star that = (Star) obj;
		return this.firstName.equals(that.firstName)
		&& this.lastName.equals(that.lastName)
		&& this.instrument.equals(that.instrument)
		&& this.sales == that.sales;
		}
	}
}

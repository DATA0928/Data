package Exercise1;

import junit.framework.TestCase;

public class HouseInformationTest extends TestCase {
	public void testConstruction() {
		new HouseInformation("Ranch", 7, 375.000, "23 Maple Street", "Brookline");
		new HouseInformation("Colonial", 9, 450.000, "5 Joye Road", "Newton");
		new HouseInformation("Cape", 6, 235.000, "83 Winslow Road", "Waltham");
	}
}

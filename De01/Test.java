package De01;

import junit.framework.TestCase;

public class Test extends TestCase {
	Milk m1 = new Milk("Dielac", 0.5, 120000, new Specification(12, 15), new Manufactor("Vinamilk", "Viet Nam"),
			new Date(1, 12, 2019), new Date(1, 12, 2022));
	Milk m2 = new Milk("Lactogen", 0.9, 294000, new Specification(15, 20), new Manufactor("Nestle", "USA"),
			new Date(1, 8, 2020), new Date(1, 8, 2023));
	Milk m3 = new Milk("Meiji Gold 1", 0.9, 463000, new Specification(15, 20), new Manufactor("Meiji", "Japan"),
			new Date(1, 6, 2019), new Date(1, 6, 2022));
	Milk m4 = new Milk("Grow Optimal", 0.9, 256000, new Specification(15, 20), new Manufactor("VinaMilk", "VietNam"),
			new Date(1, 11, 2021), new Date(1, 11, 2023));

	public void testSameCompany() {
		assertEquals(m1.sameCompany(m4), false);
		assertEquals(m2.sameCompany(m3), false);
		assertEquals(m3.sameCompany(m4), false);
		assertEquals(m4.sameCompany(m2), false);
	}

	public void testVolumn() {
		assertEquals(m1.volumn(), 1696.46);
		assertEquals(m2.volumn(), 3534.29);
	}
	
	public void testgreaterThan() {
		assertEquals(m1.greaterThan(m4), false);
	}

	public void testAfter() {
		Date d1 = new Date(2, 5, 2020);
		Date d2 = new Date(13, 11, 2019);
		Date d3 = new Date(26, 2, 2021);
		Date d4 = new Date(16, 6, 2020);
		assertEquals(d1.after(d4),	 true	);
		assertEquals(d1.after(d2), false);
		assertEquals(d1.after(d3), true);
	}

	public void testProduceAfter() {
		assertEquals(m1.produceAfter(new Date(12, 12, 2019)), false);
		assertEquals(m2.produceAfter(new Date(15, 6, 2020)), true);
		assertEquals(m3.produceAfter(new Date(17, 5, 2021)), true);
		assertEquals(m4.produceAfter(new Date(12, 3, 2020)), false);

	}

	public void testIsExpired() {
		assertEquals(m1.isExpired(), false);
		assertEquals(m2.isExpired(), false);
		assertEquals(m3.isExpired(), false);
		assertEquals(m4.isExpired(), false);
	}

	public void testDiscount() {
		assertEquals(m1.disCount(), 120000.0);
	}
}

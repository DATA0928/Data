package ahjb;

import junit.framework.TestCase;

public class MilkTest extends TestCase {

	Milk A1 = new Milk("Dielac", 0.5, 120000, new Specification(12, 15), new Manufactor("VinaMilk", "VietNam"),
			new Date(1, 12, 2019), new Date(1, 12, 2022));
	Milk A2 = new Milk("Lactogen", 0.9, 294000, new Specification(15, 20), new Manufactor("Nestle", "USA"),
			new Date(1, 8, 2020), new Date(1, 8, 2023));
	Milk A3 = new Milk("Meiji Gold 1", 0.9, 463000, new Specification(15, 20), new Manufactor("Meiji", "Japan"),
			new Date(1, 6, 2019), new Date(1, 6, 2022));
	Milk A4 = new Milk("Grow Optimal", 0.9, 256000, new Specification(15, 20), new Manufactor("VinaMilk", "VietNam"),
			new Date(1, 11, 2021), new Date(1, 11, 2023));

	public void testsame() {
		assertTrue(A1.sameCompany(A4));
		assertFalse(A2.sameCompany(A4));
		assertTrue(A1.sameCompany(A4));
	}
	public void testvolumn() {
		assertEquals(A1.volumn(), 1696.4600329384882);
		assertEquals(A2.volumn(), 3534.291735288517);
		assertEquals(A3.volumn(), 3534.291735288517);
		assertEquals(A4.volumn(), 3534.291735288517);
	}
public void testgreaterThan() {
		assertTrue(A4.greaterThan(A1));
		assertFalse(A2.greaterThan(A4));
		assertFalse(A3.greaterThan(A4));

		assertFalse(A1.produceAfter(new Date(1, 11, 2023)));
		assertFalse(A2.produceAfter(new Date(1, 11, 2023)));
		assertFalse(A3.produceAfter(new Date(1, 11, 2023)));
		assertFalse(A4.produceAfter(new Date(1, 11, 2023)));

		assertTrue(A1.isExpired());
		assertTrue(A2.isExpired());
		assertFalse(A3.isExpired());
		assertTrue(A4.isExpired());

		assertEquals(A1.disCount(), 0.3);
		assertEquals(A2.disCount(), 0.0);
		assertEquals(A3.disCount(), 0.3);
		assertEquals(A4.disCount(), 0.1);
	}
}

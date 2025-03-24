package De01;

public class Manufactor {
	private String companyName;
	private String country;

	public Manufactor(String companyName, String country) {
		this.companyName = companyName;
		this.country = country;
	}

	// xem mot hop sua co cung cong ty san xuat voi mot hop sua khac khong
	public boolean sameCompany(Manufactor that) {
		return (this.companyName.equals(that.companyName) && (this.country.equals(that.country)));
	}
}

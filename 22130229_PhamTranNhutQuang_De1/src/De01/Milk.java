package De01;

public class Milk {
	private String name;
	private double weight; // khoi luong tinh bang kg
	private double price; // gia ban
	private Specification specification; // qui cach cua hop
	private Manufactor manufactor; // hang san xuat
	private Date ProductionDate; // ngay san xuat
	private Date expiredDate; // ngay het han

	public Milk(String name, double weight, double price, Specification specification, Manufactor manufactor,
			Date productionDate, Date expiredDate) {
		this.name = name;
		this.weight = weight;
		this.price = price;
		this.specification = specification;
		this.manufactor = manufactor;
		this.ProductionDate = productionDate;
		this.expiredDate = expiredDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Specification getSpecification() {
		return specification;
	}

	public void setSpecification(Specification specification) {
		this.specification = specification;
	}

	public Manufactor getManufactor() {
		return manufactor;
	}

	public void setManufactor(Manufactor manufactor) {
		this.manufactor = manufactor;
	}

	public Date getProductionDate() {
		return ProductionDate;
	}

	public void setProductionDate(Date productionDate) {
		ProductionDate = productionDate;
	}

	public Date getExpiredDate() {
		return expiredDate;
	}

	public void setExpiredDate(Date expiredDate) {
		this.expiredDate = expiredDate;
	}

	public boolean sameCompany(Milk that) {
		return this.manufactor.sameCompany(that.manufactor);

	}

	public double volumn() {
		return this.specification.volumn();
	}

	public boolean greaterThan(Milk other) {
		return this.volumn() > other.volumn();
	}

	public boolean after(Date that) {
		return this.expiredDate.after(that);
	}

	public boolean produceAfter(Date thatDate) {
		return this.ProductionDate.after(thatDate);
	}

	public boolean isExpired() {
		Date today = new Date(22, 12, 2022);
		return this.ProductionDate.after(today);
	}

	public double disCount() {
		if (this.ProductionDate.after(new Date(1, 1, 2020))) {
			return this.price - (this.price * 0.3);
		} else if (this.ProductionDate.after(new Date(1, 1, 2020))
				&& !this.ProductionDate.after(new Date(1, 6, 2021))) {
			return this.price - (this.price * 0.1);
		} else
			return this.price;

	}
}

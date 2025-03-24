package ahjb;

public class Milk {
	private String name;
	private double weight;
	private double price;
	private Specification specification;
	private Manufactor manufactor;
	private Date ProductionDate;
	private Date ExpiredDate;

	public Milk(String name, double weight, double price, Specification specification, Manufactor manufactor,
			Date productionDate, Date expiredDate) {
		super();
		this.name = name;
		this.weight = weight;
		this.price = price;
		this.specification = specification;
		this.manufactor = manufactor;
		ProductionDate = productionDate;
		ExpiredDate = expiredDate;
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
		return ExpiredDate;
	}

	public void setExpiredDate(Date expiredDate) {
		ExpiredDate = expiredDate;
	}

	// indicates a carton of milk produced by the same company as another carton of
	// milk or not.
	public boolean sameCompany(Milk that) {
		return this.manufactor.sameCompany(that.manufactor);

	}

	// compute the volumn
	public double volumn() {
		return this.specification.volumn();

	}

	// indicates that a carton of milk has a larger volume than the volume of
	// another milk carton or not.
	public boolean greaterThan(Milk that) {
		return this.volumn() > that.volumn();
	}

	// determine if a carton of milk has the following production date a given day
	public boolean produceAfter(Date that) {
		return this.ProductionDate.after(that);
	}

	// isExpired determines that the milk carton has expired as of today December
	// 22, 2022. (December 22, 2022 occurs after the expiration date)
	public boolean isExpired() {
		Date today = new Date(22, 12, 2022);
		return this.ExpiredDate.after(today);
	}

	// to compute discounts for the following types of milk
	public double disCount() {
		if (this.ProductionDate.before(new Date(1, 1, 2020))) {
			return 0.3;
		} else if (this.ProductionDate.after(new Date(1, 1, 2020))
				&& !this.ProductionDate.before(new Date(1, 6, 2021))) {
			return 0.1;
		} else
			return 0;

	}
}

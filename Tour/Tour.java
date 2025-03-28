package Tour;

public abstract class Tour {
    protected String name;
    protected String description;
    protected int days;
    protected double basePrice;

    public Tour(String name, String description, int days, double basePrice) {
        this.name = name;
        this.description = description;
        this.days = days;
        this.basePrice = basePrice;
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public abstract double getPrice();

    public String getDescription() {
        return name + ": " + description + " - " + days + " days - Price: " + getPrice();
    }
}

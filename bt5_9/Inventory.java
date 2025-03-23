package bt5_9;

public interface Inventory {
	public double averagePrice();

	public int howMany();

	public double priceTotal();

	public void replaceName(String oldName, String newName);

	public Inventory eliminate(String toyName);
}

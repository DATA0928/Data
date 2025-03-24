package Ex5_7;

public interface IShoppingList {
	// computes the number of items on this shopping list
	public int howMany();

	// determines the highest unit price
	// in the shopping list
	public double highestPrice();

	// determine the list of all brand names
	public IStringList brandList();
}

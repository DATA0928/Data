package Bai2;

public class CoffeeSale {
	String kind;
	double price;
	double weight;
	CoffeeSale(String kind, double price, double weight) {
	this.kind = kind;
	this.price = price;
	this.weight = weight;
	}
	// to compute the total cost of this coffee purchase
	// [in dollars]
	double cost() {
		return this.price * this.weight;
	}
	// to determine whether this coffee’s price is more than amount
	boolean priceOver(double amount) {
	return this.price > amount;
	}
}

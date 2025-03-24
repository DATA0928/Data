package Đề3;

public abstract class RenItems implements RenItem {
	protected LibaryItem item;
	protected int rentedDays;
	public RenItems(LibaryItem item, int rentedDays) {
		super();
		this.item = item;
		this.rentedDays = rentedDays;
	}
	
}

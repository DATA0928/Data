package Ex5_7;

public class Coffee extends AnItem {
	private String label;

	public Coffee(String label, String branchName, double weight, double price) {
		super(branchName, weight, price);
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
}

package bt4_1;

public abstract class ABANKACCOUNT implements IBANKACCOUNT {
	protected String idNumber;
	protected String CustomerName;
	double balance;
	public ABANKACCOUNT(String idNumber, String customerName, double balance) {
		super();
		this.idNumber = idNumber;
		CustomerName = customerName;
		this.balance = balance;
	}
	
	
	}
	
	
		
	


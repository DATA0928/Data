package bt4_1;



import org.junit.Test;

public class TestACCOUNT {

	@Test
	public void testCheckingAccount() {
		new Checking_Account("1729", "Earl Gray", 1.250, 500);

	}

	@Test
	public void testSavingAccount() {
		new SavingAccount("2992,", "Annie Proulx", 800, 3.5);
	}

	@Test
	public void testCD() {
		new CD("4104", "Ima Flatt", 10.123, 4, new Date(1, 6, 2005));

	}

}

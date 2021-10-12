package training.abstraction;

public class CanaraBank extends BankAbstraction {

	private int TIME = 1;
	private float RATE = 6.0f;

	@Override
	public void addInterest() {

		float totalBalance = ((getTotalBalance() * TIME * RATE) / 100) + getTotalBalance();
		setTotalBalance(totalBalance);

	}

}

package training.abstraction;

public class FederalBank extends BankAbstraction {

	private int TIME = 2;
	private float RATE = 11.25f;

	@Override
	public void addInterest() {
		
		float totalBalance=((getTotalBalance() * TIME * RATE) / 100) + getTotalBalance();
		setTotalBalance(totalBalance);

	}

}

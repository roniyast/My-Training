package training.abstraction;

public class BankingTransaction {

	public static void main(String[] args) {

		FederalBank fb = new FederalBank();
		System.out.println("Canara Bank");
		fb.setTotalBalance(10000.00f);
		fb.deposit(5000);
		fb.withdraw(1000);
		fb.addInterest();
		fb.display();

		CanaraBank cb = new CanaraBank();
		System.out.println("Federal Bank");
		cb.setTotalBalance(10000.00f);
		cb.deposit(2000);
		cb.withdraw(100);
		cb.addInterest();
		cb.display();

		/*
		 * BankAbstraction b = new FederalBank(); checkObject(b); BankAbstraction b1 =
		 * new CanaraBank(); checkObject(b1);
		 */
	}

	/*
	 * private static void checkObject(BankAbstraction b) { if (b instanceof
	 * FederalBank) { FederalBank f = (FederalBank) b; } else { CanaraBank c =
	 * (CanaraBank) b; }
	 */
}

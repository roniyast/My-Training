package training.abstraction;

public abstract class BankAbstraction {

	private float totalBalance;

	public abstract void addInterest();

	public void deposit(float amount) {
		float total = getTotalBalance() + amount;
		setTotalBalance(total);
	}

	public void withdraw(float amount) {

		if (getTotalBalance() >= amount) {
			
			float total =getTotalBalance() - amount;
			setTotalBalance(total);
		}
	}

	public void display() {

		System.out.println("Total Balance available  : " + getTotalBalance() + "\n");
	}

	public float getTotalBalance() {
		return totalBalance;
	}

	public void setTotalBalance(float totalBalance) {
		this.totalBalance = totalBalance;
	}
}

package training.abstraction;

public class FullTimeEmployee extends Employee {

	private float PAYHOUR = 1000.00f;
	private int WORKINGHOUR = 8;

	public FullTimeEmployee(String name) {
		super(name);

	}

	@Override
	public void calculateSalary() {

		float totalSalary = PAYHOUR * WORKINGHOUR;
		setSalary(totalSalary);
		display();
	}

}

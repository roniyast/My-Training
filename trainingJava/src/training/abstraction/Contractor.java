package training.abstraction;

public class Contractor extends Employee {

	private float PAYHOUR = 1000.00f;

	public Contractor(String name) {
		super(name);
	}

	@Override
	public void calculateSalary() {

		float workingHour = 10;
		float totalSalary = PAYHOUR * workingHour;
		setSalary(totalSalary);
		display();
	}

}

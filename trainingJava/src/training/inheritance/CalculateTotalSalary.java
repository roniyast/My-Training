package training.inheritance;

public class CalculateTotalSalary extends CalculateHraPf {
	private static float salary;

	public static void main(String[] args) {

		CalculateTotalSalary c = new CalculateTotalSalary();

		c.setBasicPay(10000.00f);
		c.setDeduction(400.00f);
		c.setBonus(600.00f);

		c.calculateValues(c.getBasicPay());
		c.calculateSalary();
		c.display();

	}

	public void calculateSalary() {

		float totalSalary=getBasicPay() + getHra() - getPf() - getDeduction() + getBonus();
		setSalary(totalSalary);

	}

	public void display() {

		System.out.println("************Salary Slip*****************");
		System.out.println("Employee name :\tRoniya Thomas");
		System.out.println("Total Salary  :" + "\t" + getSalary());
		System.out.println("Basic Pay     :" + "\t" + getBasicPay());
		System.out.println("Deduction     :" + "\t" + getDeduction());
		System.out.println("Bonus         :" + "\t" + getBonus());
		System.out.println("HRA           :" + "\t" + getHra());
		System.out.println("PF            :" + "\t" + getPf());

	}

	public static float getSalary() {
		return salary;
	}

	public static void setSalary(float salary) {
		CalculateTotalSalary.salary = salary;
	}

}

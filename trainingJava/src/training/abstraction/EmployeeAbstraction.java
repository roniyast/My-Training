package training.abstraction;

public class EmployeeAbstraction {

	public static void main(String args[]) {

		Contractor c = new Contractor("Roniya");
		c.calculateSalary();
		
		FullTimeEmployee f = new FullTimeEmployee("David");
		f.calculateSalary();

	}
}

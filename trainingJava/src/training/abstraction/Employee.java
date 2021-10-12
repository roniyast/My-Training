package training.abstraction;

public abstract class Employee {

	private String name;
	private float salary;
	
	public Employee(String name) {
		
		this.name=name;
	}

	public abstract void calculateSalary();

	public void display() {

		System.out.println("*******Salary Details*******");
		System.out.println("Name      :\t" + name);
		System.out.println("Salary    :\t" + getSalary());
		System.out.println();
	}
	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
}

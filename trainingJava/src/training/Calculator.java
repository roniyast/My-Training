package training;

public class Calculator {
	private int num1;
	private int num2;

	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		
	}

	public void add() {
		int result = num1 + num2;
		System.out.println(result);
	}

	public void subtract() {
		int result = num1 - num2;
		System.out.println(result);
	}

	public void multiply() {
		int result = num1 * num2;
		System.out.println(result);
	}

	public void divide() {
		float result = num1 / num2;
		System.out.println(result);
	}
	
	public void display() {
		System.out.println("Calculator\n");
		System.out.print("Addition of " + num1 + " and " + num2 + " gives the result : ");
		add();
		System.out.print("Subtraction of " + num1 + " and " + num2 + " gives the result : ");
		subtract();
		System.out.print("Multiplication of " + num1 + " and " + num2 + " gives the result : ");
		multiply();
		System.out.print("Division of " + num1 + " and " + num2 + " gives the result : ");
		divide();
	}

	public static void main(String[] args) {
		Calculator c = new Calculator(5, 3);
		c.display();

	}
}

package training;

public class StaticMethod {

	private static String name;
	private static int age;

	public static void getName() {
		System.out.println("Name\t: " + name);
	}

	public static void setName(String name) {
		StaticMethod.name = name;
	}

	public static void getAge() {
		System.out.println("Age\t: " + age);
	}

	public static void setAge(int age) {
		StaticMethod.age = age;
	}

	public static void main(String args[]) {

	setName("David");
	setAge(2);
	getName();
	getAge();

	}

}

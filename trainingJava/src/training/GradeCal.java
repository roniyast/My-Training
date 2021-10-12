package training;

import java.util.Scanner;

public class GradeCal {
	private static float stud1[];
	private static float stud2[];
	
	public static float[] getStud1() {
		return stud1;
	}

	public static void setStud1(float[] stud1) {
		GradeCal.stud1 = stud1;
	}
	
	public static float[] getStud2() {
		return stud2;
	}

	public static void setStud2(float[] stud2) {
		GradeCal.stud2 = stud2;
	}


	public GradeCal() {
		float a[] = new float[3];
		float b[] =new float[3];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the marks of the first student for the 3 subjects");
		for (int i = 0; i < 3; i++) {

			a[i] = in.nextFloat();

		}
		setStud1(a);
		System.out.println("Enter the marks of the second student for the 3 subjects");
		for (int i = 0; i < 3; i++) {

			b[i] = in.nextFloat();

		}
		setStud2(b);
		in.close();
	}

	public float total(float[] a) {
		float t = 0.0f;
		for (int i = 0; i < 3; i++) {
			t += a[i];
		}
		return t;
	}
	
	public void findGrade(float t) {
		
		float avg = (t/3);
		switch ((int)avg/10) {
		case 9:
            System.out.println("Grade : A+");
            break;
        case 8:
        case 7:
            System.out.println("Grade : A");
            break;
        case 6:
            System.out.println("Grade : B");
            break;
        case 5:
            System.out.println("Grade : C");
            break;
        default:
            System.out.println("Grade : D");
            break;
		
		}
		
	}

	public static void main(String args[]) {

		GradeCal gc = new GradeCal();
		float total1 = gc.total(getStud1());
		System.out.println("The total of the 3 subjects of the first student :" + total1);
		gc.findGrade(total1);
		System.out.println("**********************");
		float total2 = gc.total(getStud2());
		System.out.println("The total of the 3 subjects of the second student :" + total2);
		gc.findGrade(total2);
		System.out.println("**********************");
	}

}

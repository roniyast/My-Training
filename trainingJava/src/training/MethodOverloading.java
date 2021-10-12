package training;

public class MethodOverloading {

	public void avg(float a, float b, float c) {
		
		float avgF=((a+b+c)/3);
		System.out.println("Average of the floating numbers : "+avgF);

	}

	public void avg(int i, int j, int k) {
		
		int avgI=((i+j+k)/3);
		System.out.println("Average of the integer numbers : "+avgI);
	}
	public void area(float l) {
		
		float area=l*l;
		System.out.println("Area of  square :"+area);
		
	}
	public void area(float l, float b) {
		
		float area =l*b;
		System.out.println("Area of  rectangle :"+area);
		
	}
	public void area(double r ) {
		
		double area = 3.14*r*r;
		System.out.println("Area of  circle :"+area);
		
	}

	public static void main(String args[]) {

		MethodOverloading mo = new MethodOverloading();
		float a = 10.0f, b = 30.0f, c = 20.0f;
		int i = 10, j = 20, k = 30;
		double r=20.0d;
		float l= 10.0f,h=20.0f,p=30.0f;
		mo.avg(a, b, c);
		mo.avg(i, j, k);
		mo.area(r);
		mo.area(p);
		mo.area(l, h);

	}
}

package p2;

import java.util.Scanner;

class Overload{
	void area(double r){
		double area = 3.14*r*r;
		System.out.println("The area of circle is "+area);
	}
	void area(int a, int b){
		int area = a*b;
		System.out.println("The area of rectangle is "+area);
	}
	void area(double l, double h){
		double area = 0.5*l*h;
		System.out.println("The area of triangle is "+area);
	}
}


public class Methodoverloading {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Overload calc = new Overload();
		
		System.out.println("Enter the radius:");
		double c = in.nextDouble();
		calc.area(c);
		
		System.out.println("Enter the length & breadth:");
		int x = in.nextInt();
		int y = in.nextInt();
		calc.area(x,y);
		
		System.out.println("Enter the length & height:");
	    double p = in.nextDouble();
	    double q = in.nextDouble();
		calc.area(p,q);

	}

}

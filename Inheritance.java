package p2;
class Content{
	int r = 10;
}
class  Circle extends Content{
	void area() {
	double area = 3.14 * r * r;
	System.out.println("The area of circle is"+area);
}
}
class  Semicircle extends Content{
	void area() {
	double area = (3.14 * r * r)/2;
	System.out.println("The area of semicircle is"+area);
}
}

public class Inheritance {
	public static void main(String[]args) {
		Circle obj = new Circle();
		Semicircle pre = new Semicircle();
		obj.area();
		pre.area();
	}

}

package p2;

abstract class Shape{
	abstract void  numberofsides();
}


class Rectangle extends Shape{
	int side; 
	Rectangle(int side){
	this.side = side;	
	}
public void numberofsides()
{
	System.out.println("Number of sides of rectangle="+side);
	
}}
class Triangle extends Shape{
	int side;
	Triangle(int side){
		this.side = side;
		
	}
	public void numberofsides() 
	{
		System.out.println("Number of sides of triangle="+side);
	}
}
class Hexagon extends Shape{
	int side;
	Hexagon(int side){
		this.side = side;
		
	}
	public void numberofsides() 
	{
		System.out.println("Number of sides of Hexagon="+side);
	}
}
public class Abstracts{
	public static void main(String[] args) {
		Rectangle r = new Rectangle(4);
		Triangle t = new Triangle(3);
		Hexagon h = new Hexagon(6);
		r.numberofsides();
		t.numberofsides();
		h.numberofsides();
	}
}



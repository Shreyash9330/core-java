package oopsConcept;

class Shape 
{
	void area() 
	{
		System.out.println("Calculating area of Shape");
	}
}
class Circle extends Shape
{
	double length ,breadth;
	
	Circle(double length,double breadth)
	{
			this.length=length;
			this.breadth= breadth;
	}
	void area()
	{
		System.out.println("Area Of Circle are "+(length * breadth));
	}
}
class Rectangle extends Shape 
{
	double length,breadth;
	
	Rectangle(double length,double breadth)
	{
		this.length=length;
		this.breadth= breadth;
	}
    void area()
	{
    	System.out.println("Area Of Rectangle are "+(length * breadth));
	}
}
public class Polymorphism2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package oopsConcept;

class Shape
{
	Shape draw()
	{
		System.out.println("In draw () Of shape Class ");
		return new Shape();
	}
}

class Circle extends Shape
{
	Circle draw()
	{
		System.out.println("In draw() of Circle Class");
		return new Circle();
	}
}
public class ConvariantReturnTy {

	public static void main(String[] args) {
		Shape s = new Circle();
		s.draw();
	}

}


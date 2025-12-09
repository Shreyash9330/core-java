package oopsConcept;
						// Multilevel Inheritance
class GrandFather
{
	void hasHouse()
	{
		System.out.println("GranFather Build a House ");
	}
}

class Father extends GrandFather
{
	void hasCar()
	{
		System.out.println("Father Buy New Car ");
	}
}

class Son extends Father
{
	void hasBike()
	{
		System.out.println("Son Buy New Bike");
	}
}

public class Inheritance4 {
		public static void main(String []args)
		{
			Son s1 = new Son();
			s1.hasHouse();
			s1.hasCar();
			s1.hasBike();
		}
}

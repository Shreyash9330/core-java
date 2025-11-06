package oopsConcept;

class Animal1
{
	void sound()
	{
		System.out.println("This is a Animal" );
	}
}

class Cow extends Animal1
{
	void sound()
	{
		System.out.println("Cow has lowing");
	}
}

class Goat extends Animal1
{
	void sound()
	{
		System.out.println("Goat has a bleat");
	}
}

class Horse extends Animal1
{
	void sound()
	{
		System.out.println("Horse ha  neigh or whinny");
	}
}


public class Polymaorphism1 {
	public static void main(String[] args) {
		
		Animal1 a1 = new Animal1();
		Animal1 a2 = new Cow();
		Animal1 a3 = new Horse();
		
		a1.sound();
		a2.sound();
		a3.sound();
	}
}

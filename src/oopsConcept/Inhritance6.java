package oopsConcept;

class Animal
{
	void sound()
	{
		System.out.println("Animal Makes Sound  ");
	}
}

class Dog extends Animal
{
	void sound()
	{
		System.out.println("Dog Barks");
		super.sound();
	}
	
	
}

public class Inhritance6 {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.sound();

	}

}

package Practice;

			// Abstract class in java 
abstract class Animal 
{
	abstract void Sound();
}

class Dog extends Animal
{
	void Sound() {
		System.out.println("Dog Barks");
	}
}

class Cat extends Animal 
{
	void Sound() {
		System.out.println("Cat Meow");
	}
}
public class AbstractClass {

	public static void main(String[] args) {
		Animal an1 = new Dog();
		Animal an2 = new Cat();
		an1.Sound();
		an2.Sound();
	}

}

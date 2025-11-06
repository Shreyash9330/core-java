package Practice;

abstract class Vehicle
{
	abstract void start();
	abstract void Stop();
	
}

class Car extends Vehicle
{
	void start()
	{
		System.out.println("Car is Start ");
	}
	
	void Stop()
	{
		System.out.println("Car Is A  Stop");
	}
}

class  Bike extends Vehicle
{
	void start()
	{
		System.out.println("Bike is Start ");
	}
	
	void Stop()
	{
		System.out.println("Bike  Is A  Stop");
	}
}

public class AbstractClass1 {

	public static void main(String[] args) {
		Vehicle v1 = new Car();
		Vehicle v2 = new Bike();
		v1.start();
		v1.Stop();
		v2.start();
		v2.Stop();

	}

}

package oopsConcept;

class MThread2 extends Thread
{
	
	public void run()
	{
		System.out.println("In run() of " + Thread.currentThread().getName());
	}
	
}

public class Multithreading2 {

	public static void main(String[] args) {
		
		MThread2 m = new MThread2();
		m.setName("First");
		m.start();
		
		System.out.println(m.isAlive());
		
		MThread2 m1 = new MThread2();
		m1.setName("Second");
		m1.start();
	}

}

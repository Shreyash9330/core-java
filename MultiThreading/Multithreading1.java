package oopsConcept;

class MThread1 implements Runnable
{
	
	public void run()
	{
		System.out.println("In run() method");
	}
}


public class Multithreading1 {

	public static void main(String[] args) {
		
			MThread1 m = new MThread1();
			Thread t = new Thread(m);
			
			t.start();

	}

}

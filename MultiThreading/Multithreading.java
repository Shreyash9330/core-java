package oopsConcept;

class MThread extends Thread
{
	
	public void run()
	{
		System.out.println("In run() method");
	}
}



public class Multithreading {

	public static void main(String[] args) {
			
		MThread mt = new MThread();
		mt.start();

	}

}

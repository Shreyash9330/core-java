package oopsConcept;

class TDemo extends Thread
{
	 @Override
	public void run()
	{
		
		for(int i =0; i<4; i++)
		{
			try {
				Thread.sleep(2500);
				System.out.println("In run() convert thread" + 
				Thread.currentThread().getName()+ "," + "It is priority is " + this.getPriority()+"Prirority");
			}
			catch(InterruptedException e )
			{ 
				e.printStackTrace();
			}
		}
	}



}


public class MultiThreading3 {

	public static void main(String[] args) throws InterruptedException {
		
		TDemo  t =  new TDemo();
		t.setName("One");
		t.setPriority(Thread.MAX_PRIORITY);
		t.start();
		t.join();
		TDemo t1 = new TDemo();
		
		t1.setName("TWO");
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t1.join();
		
		TDemo t2 = new TDemo();
		t2.setName("Third");
		t2.setPriority(Thread.NORM_PRIORITY);
		t2.start();
		t2.join();
		
			
			
		}
		
	}



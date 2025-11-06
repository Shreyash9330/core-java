package basic;

						/// Instance & Local Variables in Java
public class Demo {
	 // Intance Variable 
	int a=10;
	int b=20;
	void add()
	{
		System.out.println("Sum"+(a+b));
	}
	void add1()
	{
		//Local variable 
		int c=30;
		int d=40;
		System.out.println("Sum="+(c+b));
	}
	
	void add2()
	{
		System.out.println("Sum ="+(a+b));
	}
		
	public static void main(String[] args) {
		
			Demo d= new Demo();
			d.add();
			d.add1();
			d.add2();
	}

}

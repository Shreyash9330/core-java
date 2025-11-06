package basic;

class Demo11{
	// Instance VAriable
		int a=10;
		int b=20;
		
		
		void add() {
			
			System.out.println("Sum  = "+(a+b));
		}
		void add1()
		{
			//local Variable
			int a=98;
			int b=25;
			System.out.println("Sum = "+(a+b));
		}
		
		void add2()
		{
			//System.out.println("Sum = "+(c+d));
			System.out.println("Sum = "+(a+b));
		}
}		
public class IVariables {
		
	public static void main(String []args ) 
	{
		System.out.println("");
		Demo11 d =new Demo11();
		d.add();
		d.add1();
		d.add2();
	}
	
}
